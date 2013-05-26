package com.bourke.glimmr.tape;

import com.bourke.glimmr.common.TaskQueueDelegateFactory;
import com.bourke.glimmr.fragments.photoset.AddToPhotosetDialogFragment;
import com.bourke.glimmr.tasks.AddItemToPhotosetTask;
import com.squareup.tape.TaskQueue;

public class AddToPhotosetTaskQueueService extends AbstractTaskQueueService {

    private static final String TAG = "Glimmr/AddToPhotosetTaskQueueService";

    private static boolean IS_RUNNING;

    @Override
    public void onCreate() {
        super.onCreate();
        IS_RUNNING = true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        IS_RUNNING = false;
    }

    @Override
    protected void initTaskQueue() {
        TaskQueueDelegateFactory<AddItemToPhotosetTask> factory =
            new TaskQueueDelegateFactory<AddItemToPhotosetTask>(this);
        mQueue = new TaskQueue(factory.get(
                    AddToPhotosetDialogFragment.QUEUE_FILE,
                    AddItemToPhotosetTask.class));
    }
}
