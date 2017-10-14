package com.example.android.tourguide;

/**
 * {@link Object} We create an object because the ListView only supports a field as we need several
 * Variables, we make them inside the object
 */

 public class Object {

    /**
     * String resource ID for the Title of the object
     */
    private int mTitleId;

    /**
     * String resource ID for the Tourism of the object
     */
    private int mTourismId;

    /**
     * Id resource ID for the object
     */
    private int mResourceId;

    /**
     * Image resource image ID for the object
     */
    private int mImageResourceId;


    /**
     * Create a new Object object.
     *
     * @param titleId         is the string resource ID for the object with the title text
     * @param tourismId       is the string resource Id for the object with the Tourism explication
     * @param imageResourceId is the drawable resource ID for the image associated with the object
     * @param resourceId      is the resource ID for the id file associated with this object
     */
    public Object(int titleId, int tourismId, int imageResourceId,
                  int resourceId) {
        mTitleId = titleId;
        mTourismId = tourismId;
        mImageResourceId = imageResourceId;
        mResourceId = resourceId;
    }

    /**
     * Get the string resource ID for the title of the object.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the Tourism of the object.
     */
    public int getTourismId() {
        return mTourismId;
    }

    /**
     * Return the image resource ID of the object.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return resource ID of the object.
     */

    public int getResourceId() {
        return mResourceId;
    }

}