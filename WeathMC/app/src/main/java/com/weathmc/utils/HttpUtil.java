package com.weathmc.utils;

import com.weathmc.model.WeatherBean;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/2/8.
 */

public class HttpUtil {
    private static HttpUtil _instance = null;
    private Retrofit retrofit;

    private HttpUtil() {
    }

    public static HttpUtil getInstance() {
        if (_instance == null) {
            _instance = new HttpUtil();
        }
        return _instance;
    }

    public void getWeathApi(Callback<WeatherBean> callback) {
        retrofit = new Retrofit.Builder().
                baseUrl(HttpConfig.BASE_URL).
                client(new OkHttpClient()).
                addConverterFactory(GsonConverterFactory.create())
                .build();
        APIService _apiService = retrofit.create(APIService.class);

        Call<WeatherBean> weatherBeanCall = _apiService.getWeath();

        weatherBeanCall.enqueue(callback);
    }
}
