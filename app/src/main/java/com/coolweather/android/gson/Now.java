package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:33
 * @ 描述：null
 * @ 修改： 于 年 月 日更改
 * @ 版本:1.0
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;  // 当前温度
    @SerializedName("cond")
    public More more;   // 更多信息

    public class More {
        @SerializedName("txt")
        public String info; // 天气信息
    }
}