package com.app.sampleproject.model.utils;

import android.arch.core.BuildConfig;
import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
    private static final String mySharedPrefrences = BuildConfig.APPLICATION_ID ;
    private static SharedPreferences mSharedPreferences;
    private static SharedPreferences.Editor mEditor;

    MySharedPreferences(Context context) {
        mSharedPreferences =context.getSharedPreferences(mySharedPrefrences, Context.MODE_PRIVATE);
    }

    public String getUserId() {
        if (mSharedPreferences != null) {
//            return mSharedPreferences.getString(ConstantsKey.USER_ID, "");
        }
        return "";
    }

    public void saveUserId(String user_id) {
        mEditor = mSharedPreferences.edit();
//        mEditor.putString(ConstantsKey.USER_ID,user_id);
        mEditor.apply();
    }

    public void saveUrls(String baseUrl,String imageUrl) {
        mEditor = mSharedPreferences.edit();
//        mEditor.putString(ConstantsKey.BASEURL,baseUrl);
//        mEditor.putString(ConstantsKey.IMAGEURL,imageUrl);
        mEditor.apply();
//        if (mSharedPreferences!= null) {
//            Constants.BASE_URL=mSharedPreferences.getString(ConstantsKey.BASEURL, "");
//            Constants.BASE_IMAGE_URL=mSharedPreferences.getString(ConstantsKey.IMAGEURL, "");
//        }
    }

    public String getBaseUrl(){
        if (mSharedPreferences != null) {
//            return mSharedPreferences.getString(ConstantsKey.BASEURL, "");
        }
        return "";
    }

    public void clearAllData(Context context) {
        mEditor = mSharedPreferences.edit();
        mEditor.clear().apply();
    }

    public void removeData(Context context) {
        mEditor = mSharedPreferences.edit();
//        mEditor.remove(ConstantsKey.USER_ID);
        mEditor.apply();
    }
}

