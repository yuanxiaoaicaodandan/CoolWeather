package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ 作者：上善若水
 * @ 时间：2020-04-09 15:34
 * @ 描述：null
 * @ 修改： 于 年 月 日更改
 * @ 版本:
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort; // 舒适度
    @SerializedName("cw")
    public CarWash carWash; // 洗车建议
    public Sport sport; // 运动建议

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}