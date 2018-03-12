package com.app.sampleproject.model.retrofit;

import com.app.sampleproject.model.pojo.Model;

/**
 * Created by MY PC on 28-Aug-17.
 */

public interface CallbackMethodInterface
{
    void onFetchStart();
    void onFetchProgress(Model model);
    void onFetchComplete(int i);
    void onFetchFailed();
}
