package com.weathmc.model;

/**
 * Created by Administrator on 2017/2/9.
 */

public class DayBean {
    private String tq1;     //白天天气
    private String tq2;     //夜间天气，当与白天天气相同时，两者可合并为一个
    private String numtq1;  //白天天气编码
    private String numtq2;  //夜间天气编码
    private String qw1;     //白天气温
    private String qw2;     //夜间气温
    private String fl1;     //白天风力
    private String numfl1;  //白天风力编码
    private String fl2;     //夜间风力
    private String numfl2;  //夜间风力编码
    private String fx1;     //白天风向
    private String numfx1;  //白天风向编码
    private String fx2;     //夜间风向，如白天风力风向与夜间风力风向一致，可合并为一行
    private String numfx2;  //夜间风向编码
    private String date;    //预报日期

    public String getTq1() {
        return tq1;
    }

    public void setTq1(String tq1) {
        this.tq1 = tq1;
    }

    public String getTq2() {
        return tq2;
    }

    public void setTq2(String tq2) {
        this.tq2 = tq2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumfx2() {
        return numfx2;
    }

    public void setNumfx2(String numfx2) {
        this.numfx2 = numfx2;
    }

    public String getQw2() {
        return qw2;
    }

    public void setQw2(String qw2) {
        this.qw2 = qw2;
    }

    public String getFl1() {
        return fl1;
    }

    public void setFl1(String fl1) {
        this.fl1 = fl1;
    }

    public String getNumfl1() {
        return numfl1;
    }

    public void setNumfl1(String numfl1) {
        this.numfl1 = numfl1;
    }

    public String getFl2() {
        return fl2;
    }

    public void setFl2(String fl2) {
        this.fl2 = fl2;
    }

    public String getNumfl2() {
        return numfl2;
    }

    public void setNumfl2(String numfl2) {
        this.numfl2 = numfl2;
    }

    public String getFx1() {
        return fx1;
    }

    public void setFx1(String fx1) {
        this.fx1 = fx1;
    }

    public String getNumfx1() {
        return numfx1;
    }

    public void setNumfx1(String numfx1) {
        this.numfx1 = numfx1;
    }

    public String getFx2() {
        return fx2;
    }

    public void setFx2(String fx2) {
        this.fx2 = fx2;
    }

    public String getNumtq1() {
        return numtq1;
    }

    public void setNumtq1(String numtq1) {
        this.numtq1 = numtq1;
    }

    public String getNumtq2() {
        return numtq2;
    }

    public void setNumtq2(String numtq2) {
        this.numtq2 = numtq2;
    }

    public String getQw1() {
        return qw1;
    }

    public void setQw1(String qw1) {
        this.qw1 = qw1;
    }
}
