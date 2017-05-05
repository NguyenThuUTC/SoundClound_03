package com.framgia.soundcloudmusic.main.model;

/**
 * Created by admin on 5/5/2017.
 */
public class Track {
    private int mId;
    private String mTitle;
    private String mStreamUrl;
    private String mArtWorkUrl;
    private String mUserName;

    public Track() {
    }

    public Track(String title,String userName){
        this.mTitle =title;
        this.mUserName =userName;
    }


    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmStreamUrl() {
        return mStreamUrl;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public void setmStreamUrl(String mStreamUrl) {
        this.mStreamUrl = mStreamUrl;
    }

    public String getmArtWorkUrl() {
        return mArtWorkUrl;
    }

    public void setmArtWorkUrl(String mArtWorkUrl) {
        this.mArtWorkUrl = mArtWorkUrl;
    }
}
