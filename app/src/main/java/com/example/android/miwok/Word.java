package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageID=NO_IMAGE_PROVIDED;
    private int mAudioID;
    private static final int NO_IMAGE_PROVIDED=-1;


    public Word(String defaultTranslation, String miwokTranslation, int imageID,int audioID) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageID = imageID;
        this.mAudioID=audioID;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audioID) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioID=audioID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageID() {
        return mImageID;
    }
    public boolean hasImage(){
        return mImageID!=NO_IMAGE_PROVIDED;
    }

    public int getAudioID() {
        return mAudioID;
    }
}
