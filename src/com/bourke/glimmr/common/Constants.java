package com.bourke.glimmr.common;

public class Constants {

    /* Global app prefs */
    public static final String PREFS_NAME = "glimmr_prefs";

    /* File and mem cache tuning params */
    public static final boolean USE_FILE_CACHE = true;
    public static final boolean USE_MEMORY_CACHE = true;
    public static final int CACHE_TRIM_TRIGGER_SIZE = 8000000;  // 8MB
    public static final int CACHE_TRIM_TARGET_SIZE = 5000000;  // 5MB

    /* Fonts */
    public static final String FONT_RANCHO =
        "fonts/Rancho-Regular.ttf";
    public static final String FONT_ACME_REGULAR =
        "fonts/Acme-Regular.ttf";
    public static final String FONT_ARIMO_BOLDITALIC =
        "fonts/Arimo-Bolditalic.ttf";
    public static final String FONT_ARIMO_BOLD =
        "fonts/Arimo-Bold.ttf";
    public static final String FONT_ARIMO_ITALIC =
        "fonts/Arimo-Italic.ttf";
    public static final String FONT_ARIMO_REGULAR =
        "fonts/Arimo-Regular.ttf";
    public static final String FONT_GIVEYOUGLORY =
        "fonts/GiveYouGlory.ttf";
    public static final String FONT_LECKERLIONE_REGULAR =
        "fonts/LeckerliOne-Regular.ttf";
    public static final String FONT_LONDRINASOLID_REGULAR =
        "fonts/Londrinasolid-Regular.ttf";
    public static final String FONT_MAIDENORANGE =
        "fonts/Maidenorange.ttf";
    public static final String FONT_RANCHO_REGULAR =
        "fonts/Rancho-Regular.ttf";
    public static final String FONT_REENIEBEANIE =
        "fonts/ReenieBeanie.ttf";
    public static final String FONT_SHADOWSINTOLIGHT =
        "fonts/ShadowsIntoLight.ttf";

    /* Number of items to fetch per page for calls that support pagination */
    public static final int FETCH_PER_PAGE = 20;

    /* OAuth preferences */
    public static final String CALLBACK_SCHEME = "glimmr-oauth-callback";
    public static final String KEY_OAUTH_TOKEN = "glimmr_oauthtoken";
    public static final String KEY_TOKEN_SECRET = "glimmr_tokensecret";
    public static final String KEY_USER_NAME = "glimmr_username";
    public static final String KEY_USER_ID = "glimmr_userid";

    /* Photo viewer state */
    public static final String KEY_PHOTOVIEWER_LIST = "glimmr_photolist";
    public static final String KEY_PHOTOVIEWER_URL = "glimmr_photoviewer_url";
    public static final String KEY_PHOTOVIEWER_START_INDEX =
        "glimmr_photoviewer_index";
    public static final String KEY_PROFILEVIEWER_USER =
        "glimmr_profileviewer_user";

    /* Group viewer state */
    public static final String KEY_GROUPVIEWER_GROUP =
        "glimmr_groupviewer_group";
    public static final String KEY_GROUPVIEWER_USER =
        "glimmr_groupviewer_user";

    /* Photoset viewer state */
    public static final String KEY_PHOTOSETVIEWER_PHOTOSET =
        "glimmr_photosetviewer_photoset";
    public static final String KEY_PHOTOSETVIEWER_USER =
        "glimmr_photosetviewer_user";

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

    /* Photoset fragment state */
    public static final String NEWEST_PHOTOSET_PHOTO_ID =
        "glimmr_newest_photoset_photo_id";

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

    /* Notification ids */
    public static final int NOTIFICATION_NEW_CONTACTS_PHOTOS = 0;
    public static final String NOTIFICATION_NEWEST_CONTACT_PHOTO_ID =
        "glimmr_notification_newest_contact_photo_id";
}
