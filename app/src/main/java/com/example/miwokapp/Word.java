package com.example.miwokapp;

public class Word {

    private String mDefaultTranslation;
    private String mUrduTranslation;
    private int mImagesResource =ON_IMAGE_PROVIDER;

    private static final int ON_IMAGE_PROVIDER=-1;

    public Word(String DefaultTranslation, String UrduTranslation){
        mDefaultTranslation = DefaultTranslation;
        mUrduTranslation = UrduTranslation;
    }
    public Word(String DefaultTranslation, String UrduTranslation, int ImageReource){
        mDefaultTranslation = DefaultTranslation;
        mUrduTranslation = UrduTranslation;
        mImagesResource = ImageReource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getUrduTranslation(){
        return mUrduTranslation;
    }
    public int getImagesResource()
    {
        return mImagesResource;
    }
    public boolean hasImage(){
        return mImagesResource != ON_IMAGE_PROVIDER;
    }
}
