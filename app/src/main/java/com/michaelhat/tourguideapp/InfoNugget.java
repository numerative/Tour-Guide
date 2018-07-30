package com.michaelhat.tourguideapp;

public class InfoNugget {
    private int mTitle, mDescription, mTrailText;
    private int mPhotoId;

    public InfoNugget(int title, int photoId, int description, int trailText) {
        mTitle = title;
        mPhotoId = photoId;
        mDescription = description;
        mTrailText = trailText;
    }

    public InfoNugget(int title, int description) {
        mTitle = title;
        mDescription = description;
    }

    public InfoNugget(int title, int photoId, int description) {
        mTitle = title;
        mPhotoId = photoId;
        mDescription = description;
    }

    public int getTitle() {
        return mTitle;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getTrailText() {
        return mTrailText;
    }

    public int getPhotoId() {
        return mPhotoId;
    }
}
