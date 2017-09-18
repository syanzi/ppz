package com.weathmc.model;

/**
 * Created by Administrator on 2017/2/9.
 */

public class WeatherBean {
    private int code;
    private String msg;
    private int counts;
    private CityBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public CityBean getData() {
        return data;
    }

    public void setData(CityBean data) {
        this.data = data;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }






}
