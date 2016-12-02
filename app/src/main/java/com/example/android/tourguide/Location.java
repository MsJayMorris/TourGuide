package com.example.android.tourguide;

public class Location {

    private int mLocationName;

    private int mLocationAddress;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


public Location(int defaultLocationName, int defaultLocationAddress){
    mLocationName = defaultLocationName;
    mLocationAddress = defaultLocationAddress;
}

    public Location(int defaultLocationName, int defaultLocationAddress, int imageResourceId){
        mLocationName = defaultLocationName;
        mLocationAddress = defaultLocationAddress;
        mImageResourceId = imageResourceId;
    }

    public int getLocationName(){
        return mLocationName;
    }

    public int getLocationAddress() {

        return mLocationAddress;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}