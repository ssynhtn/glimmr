package com.bourke.glimmrpro.tasks;

import android.app.Activity;

import android.os.AsyncTask;

import android.util.Log;

import com.bourke.glimmrpro.common.Constants;
import com.bourke.glimmrpro.common.FlickrHelper;
import com.bourke.glimmrpro.event.Events.IUserReadyListener;

import com.googlecode.flickrjandroid.Flickr;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.googlecode.flickrjandroid.people.User;

public class LoadUserTask extends AsyncTask<OAuth, Void, User> {

    private static final String TAG = "Glimmr/LoadUserTask";

    private IUserReadyListener mListener;
    private String mUserId;
    private Activity mActivity;

    public LoadUserTask(Activity a, IUserReadyListener listener,
            String userId) {
        mActivity = a;
        mListener = listener;
        mUserId = userId;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected User doInBackground(OAuth... params) {
        OAuth oauth = params[0];
        if (oauth != null) {
            User user = oauth.getUser();
            OAuthToken token = oauth.getToken();
            try {
                Flickr f = FlickrHelper.getInstance().getFlickrAuthed(
                        token.getOauthToken(), token.getOauthTokenSecret());
                return f.getPeopleInterface().getInfo(mUserId);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (Constants.DEBUG) Log.d(TAG, "Making unauthenticated call");
            try {
                return FlickrHelper.getInstance().getPeopleInterface()
                    .getInfo(mUserId);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(final User result) {
        if (result == null) {
            if (Constants.DEBUG) {
                Log.e(TAG, "Error fetching user info, result is null");
            }
        }
        mListener.onUserReady(result);
    }

    @Override
    protected void onCancelled(final User result) {
        if (Constants.DEBUG) Log.d(TAG, "onCancelled");
    }
}