package com.bourke.glimmrpro.common;

import java.util.Set;
import java.util.HashSet;

public class Constants {

    /* Important: set to false when doing release builds */
    public static final boolean DEBUG = true;

    /* Global app prefs */
    public static final String PREFS_NAME = "glimmr_prefs";

    /* File and mem cache tuning params */
    public static final boolean USE_FILE_CACHE = true;
    public static final boolean USE_MEMORY_CACHE = true;
    public static final int CACHE_TRIM_TRIGGER_SIZE = 8000000;  // 8MB
    public static final int CACHE_TRIM_TARGET_SIZE = 5000000;  // 5MB
    public static final int IMAGE_CACHE_LIMIT = 100;  // Images
    public static final int MEM_CACHE_PX_SIZE = 3000000;  // 3M pixels

    public static final String KEY_USER_NAME = "glimmr_user_name";
    public static final String KEY_USER_ID = "glimmr_user_id";

    /* Attributes to fetch for a photo */
    public static final Set<String> EXTRAS = new HashSet<String>();
    static {
        EXTRAS.add("owner_name");
        EXTRAS.add("url_q");
        EXTRAS.add("url_m");
        EXTRAS.add("url_l");
        EXTRAS.add("views");
    }

    /* Fonts */
    public static final int FONT_SHADOWSINTOLIGHT = 0;
    public static final String FONT_PATH_SHADOWSINTOLIGHT =
        "fonts/ShadowsIntoLight.ttf";
    public static final int FONT_ROBOTOREGULAR = 1;
    public static final String FONT_PATH_ROBOTOREGULAR =
        "fonts/Roboto-Regular.ttf";
    public static final int FONT_ROBOTOTHIN = 2;
    public static final String FONT_PATH_ROBOTOTHIN =
        "fonts/Roboto-Thin.ttf";
    public static final int FONT_ROBOTOLIGHT = 3;
    public static final String FONT_PATH_ROBOTOLIGHT =
        "fonts/Roboto-Light.ttf";
    public static final int FONT_ROBOTOBOLD = 4;
    public static final String FONT_PATH_ROBOTOBOLD =
        "fonts/Roboto-Bold.ttf";

    /* Number of items to fetch per page for calls that support pagination */
    public static final int FETCH_PER_PAGE = 20;

    /* OAuth preferences */
    public static final String KEY_OAUTH_TOKEN = "glimmr_oauthtoken";
    public static final String KEY_TOKEN_SECRET = "glimmr_tokensecret";
    public static final String KEY_ACCOUNT_USER_NAME = "glimmr_acc_user_name";
    public static final String KEY_ACCOUNT_USER_ID = "glimmr_acc_user_id";

    /* Photo viewer state */
    public static final String PHOTOVIEWER_LIST_FILE =
        "glimmr_photoviewer_photolist.json";
    public static final String KEY_PHOTOVIEWER_START_INDEX =
        "glimmr_photoviewer_start_index";
    public static final String KEY_PHOTOVIEWER_ACTIONBAR_SHOW =
        "glimmr_photoviewer_actionbar_show";

    /* Profile viewer state */
    public static final String PROFILEVIEWER_USER_FILE =
        "glimmr_profileviewer_user.json";

    /* Group viewer state */
    public static final String GROUPVIEWER_GROUP_FILE =
        "glimmr_groupviewer_group.json";
    public static final String GROUPVIEWER_USER_FILE =
        "glimmr_groupviewer_user.json";

    /* Photoset viewer state */
    public static final String PHOTOSETVIEWER_SET_FILE =
        "glimmr_photosetviewer_set.json";
    public static final String PHOTOSETVIEWER_USER_FILE =
        "glimmr_photosetviewer_user.json";

    /* Contacts fragment state */
    public static final String NEWEST_CONTACT_PHOTO_ID =
        "glimmr_newest_contact_photo_id";

    /* Photostream fragment state */
    public static final String NEWEST_PHOTOSTREAM_PHOTO_ID =
        "glimmr_newest_photostream_photo_id";

    /* FavoritesGridFragment */
    public static final String NEWEST_FAVORITES_PHOTO_ID =
        "glimmr_newest_favorites_photo_id";

    /* GroupPool fragment state */
    public static final String NEWEST_GROUPPOOL_PHOTO_ID =
        "glimmr_newest_grouppool_photo_id";
    public static final String GROUP_FRAGMENT_GROUP_ID =
        "glimmr_grouppool_group_id";

    /* Photoset fragment state */
    public static final String NEWEST_PHOTOSET_PHOTO_ID =
        "glimmr_newest_photoset_photo_id";
    public static final String PHOTOSET_FRAGMENT_SET_ID =
        "glimmr_photoset_fragment_set_id";

    /* Exif dialog state */
    public static final String KEY_EXIF_INFO_DIALOG_ACTIVITY_PHOTO =
        "glimmr_exif_info_dialog_activity_photo";

    /* Comments dialog state */
    public static final String COMMENTS_DIALOG_ACTIVITY_PHOTO =
        "glimmr_comments_dialog_activity_photo";

    /* AppService prefs */
    public static final String NEW_PHOTOS_SERVICE_INTERVAL =
        "glimmr_new_photos_service_interval";
    public static final String KEY_APP_SERVICE_OAUTH =
        "glimmr_key_app_service_oauth";

    /* PreferencesActivity */
    public static final String KEY_INTERVALS_LIST_PREFERENCE
        = "notificationIntervals";
    public static final String KEY_ENABLE_NOTIFICATIONS
        = "enableNotifications";
    public static final String KEY_HIGH_QUALITY_THUMBNAILS
        = "highQualityThumbnails";

    public static final String KEY_ENABLE_CONTACTS_NOTIFICATIONS
        = "enableContactsNotifications";
    public static final String KEY_ENABLE_ACTIVITY_NOTIFICATIONS
        = "enableActivityNotifications";

    /* New contacts photo notifications */
    public static final String NOTIFICATION_NEWEST_CONTACT_PHOTO_ID =
        "glimmr_notification_newest_contact_photo_id";

    public static final String NOTIFICATION_NEWEST_ACTIVITY_EVENT_ID =
        "glimmr_notification_newest_activity_event_id";

    public static final String TIME_ACTIVITY_ITEMS_LAST_UPDATED =
        "glimmr_time_activity_items_last_updated";

    public static final String TIME_MENUDRAWER_ITEMS_LAST_UPDATED =
        "glimmr_time_menudrawer_items_last_updated";

    /* ExploreActivity state */
    public static final String LOGIN_LATER_SELECTED =
        "glimmr_login_later_selected";

    /* Notification ids */
    public static final int NOTIFICATION_NEW_CONTACTS_PHOTOS = 0;
    public static final int NOTIFICATION_NEW_ACTIVITY = 1;

    /* DialogBuilder dialog ids */
    public static final int DIALOG_ABOUT = 0;

    public static final String STATE_MENUDRAWER =
        "net.simonvt.menudrawer.samples.ContentSample.menuDrawer";
    public static final String STATE_ACTIVE_POSITION =
        "net.simonvt.menudrawer.samples.ContentSample.activePosition";

    public static final String ACTIVITY_ITEMLIST_FILE =
        "glimmr_activity_items.json";

    public static final String PRO_MARKET_LINK =
        "market://details?id=com.bourke.glimmrpro";
}
