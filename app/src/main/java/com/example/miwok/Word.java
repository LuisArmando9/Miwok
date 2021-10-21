package com.example.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public Word(String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = miwokTranslation;

    }
    public String getmMiwokTranslation()
    {
        return  mMiwokTranslation;
    }
    public String getmDefaultTranslation()
    {
        return  mDefaultTranslation;
    }
}
