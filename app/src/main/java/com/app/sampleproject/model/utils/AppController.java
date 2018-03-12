package com.app.sampleproject.model.utils;

import android.annotation.SuppressLint;
import android.app.Application;

/**
 * Created by MY PC on 15-Jan-2018.
 */

public class AppController extends Application {
    /*
    Add this line in the manifest file
            android:name=".AppController"
     */
    private static AppController mInstance;
    @SuppressLint("StaticFieldLeak")
    public static Constants constants;
//    public static MySharedPreferences sharePreference;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        constants= new Constants(getApplicationContext());
//        sharePreference = new MySharedPreferences(getApplicationContext());
    }

    public static synchronized AppController getInstance() {
        return mInstance;
    }
}
