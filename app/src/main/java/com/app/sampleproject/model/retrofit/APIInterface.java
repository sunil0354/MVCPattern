package com.app.sampleproject.model.retrofit;

import com.app.sampleproject.model.utils.ConstantsKey;
import java.util.HashMap;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by MY PC on 27-Dec-17.
 */

public interface APIInterface {
    @GET(ConstantsKey.BASE_URL)
    Call<Object> baseurl();

    @FormUrlEncoded
    @POST(ConstantsKey.BASE_URL)
    Call<Object> signup(@FieldMap HashMap<String, String> data);

    @POST(ConstantsKey.BASE_URL)
    Call<Object> getUser(@Body Map<String, String> body);

}