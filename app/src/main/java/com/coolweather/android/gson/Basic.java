package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:30
 * @ 描述：null
 * @ 修改： 于 年 月 日更改
 * @ 版本:1.0
 */
public class Basic {
    @SerializedName("city")
    public String cityName;     // 城市名
    @SerializedName("id")
    public String weatherId;    // 天气编号
    public Update update;   // 更新状态类

    public class Update {
        @SerializedName("loc")
        public String updateTime;   // 更新时间
    }
}