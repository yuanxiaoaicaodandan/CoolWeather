package com.coolweather.android.gson;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:32
 * @ 描述：null
 * @ 修改： 于 年 月 日更改
 * @ 版本:1.0
 */
public class AQI {
    public AQICity city;    // 城市

    public class AQICity {
        public String aqi;  // 空气质量指数
        public String pm25; // pm2.5浓度
    }
}