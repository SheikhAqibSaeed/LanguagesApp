package com.example.urduenglish;

public class Word {

    private String mDefaultTranslation;
    private String mUrduTranslation;
    private int mImagesResource =ON_IMAGE_PROVIDER;
    private int mAudioResourceId;
    private static final int ON_IMAGE_PROVIDER=-1;


    public Word(String DefaultTranslation, String UrduTranslation, int audioResource){
        mDefaultTranslation = DefaultTranslation;
        mUrduTranslation = UrduTranslation;
        mAudioResourceId = audioResource;
    }
    public Word(String DefaultTranslation, String UrduTranslation, int ImageReource, int audioResource){
        mDefaultTranslation = DefaultTranslation;
        mUrduTranslation = UrduTranslation;
        mImagesResource = ImageReource;
        mAudioResourceId = audioResource;
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
    public int getAudtioResource(){
        return mAudioResourceId;
    }
}
