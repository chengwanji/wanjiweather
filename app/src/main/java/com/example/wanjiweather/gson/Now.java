package com.example.wanjiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WJ on 2016/12/15.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
