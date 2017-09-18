package com.weathmc.model;

/**
 * Created by Administrator on 2017/2/9.
 */

public class CityBean {
    private String cityId; //城市ID编号
    private String cityName;//城市名字
    private String sj;//时间
    private DayBean[] list;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    public DayBean[] getList() {
        return list;
    }

    public void setList(DayBean[] list) {
        this.list = list;
    }
}
