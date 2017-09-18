package com.weathmc.utils;

import com.weathmc.model.WeatherBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/2/8.
 */

public interface APIService {
    @GET("forecast7d?city=CH250901&key=hepj2khdr187nvlm")
    Call<WeatherBean> getWeath();

}
