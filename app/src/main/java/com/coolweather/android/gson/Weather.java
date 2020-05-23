package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:35
 * @ 描述：
 * @ 修改： 于 年 月 日更改
 * @ 版本:
 */
public class Weather {
    // 引用其他类
    public String status;   // status数据，成功返回ok
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}