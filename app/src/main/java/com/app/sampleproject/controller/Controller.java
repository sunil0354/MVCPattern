package com.app.sampleproject.controller;

import android.support.annotation.NonNull;
import android.util.Log;
import com.app.sampleproject.model.retrofit.APIClient;
import com.app.sampleproject.model.retrofit.APIInterface;
import com.app.sampleproject.model.retrofit.CallbackMethodInterface;
import com.app.sampleproject.model.pojo.Model;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by MY PC on 01-Sep-17.
 */

public class Controller  {
    private CallbackMethodInterface mcallbackMethodInterface;
    private APIInterface mApiInterface=APIClient.getClient().create(APIInterface.class);

    public Controller(CallbackMethodInterface listener) {
        mcallbackMethodInterface = listener;
    }

    public void get_sponosors(int start, int count) {
        mcallbackMethodInterface.onFetchStart();
        HashMap<String, String> hashMap = new HashMap<>();
        Log.e("TAG", "Data Send>>>\n"+hashMap.toString());
        Call<Object> call = mApiInterface.signup(hashMap);
        call.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(@NonNull Call<Object> call, @NonNull Response<Object> response) {
                JSONObject object= null;
                try {
                    object = new JSONObject(new Gson().toJson(response.body()));
                    Log.e("TAG", "Data get>>>\n: "+object );
                    int result_code=object.getInt("result_code");
                    switch (result_code){
                        case 1:
                            JSONArray jsonArray=object.getJSONArray("result_data");
                            for (int i=0;i<jsonArray.length();i++){
                                JSONObject jsonObject1=jsonArray.getJSONObject(i);
                                Model model=new Model();
                                mcallbackMethodInterface.onFetchProgress(model);
                            }
                            break;
                    }
                    mcallbackMethodInterface.onFetchComplete(result_code);
                } catch (Exception exception) {
                    Log.e("TAG", "Exception>>>\n: "+exception );
                    mcallbackMethodInterface.onFetchFailed();
                }
            }
            @Override
            public void onFailure(@NonNull Call<Object> call, @NonNull Throwable t) {
                call.cancel();
                Log.e("TAG", "Failure>>>\n: "+t );
                mcallbackMethodInterface.onFetchFailed();
            }
        });
    }
}
