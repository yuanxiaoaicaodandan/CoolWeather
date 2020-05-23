package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:34
 * @ 描述：
 * @ 修改： 于 年 月 日更改
 * @ 版本:
 */
public class Forecast {
    public String date; // 预报日期
    @SerializedName("tmp")
    public Temperature temperature; // 预报气温
    @SerializedName("cond")
    public More more;   // 更多信息

    public class Temperature {
        public String max;  //最高温
        public String min;  // 最低温
    }

    public class More {
        @SerializedName("txt_d")
        public String info; // 预测的天气信息
    }
}
