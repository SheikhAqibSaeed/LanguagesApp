package com.example.miwokapp;

public class Word {

    private String mDefaultTranslation;
    private String mUrduTranslation;

    public Word(String DefaultTranslation, String UrduTranslation){
        mDefaultTranslation = DefaultTranslation;
        mUrduTranslation = UrduTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getUrduTranslation(){
        return mUrduTranslation;
    }
}
