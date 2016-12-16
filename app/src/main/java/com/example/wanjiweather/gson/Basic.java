package com.example.wanjiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WJ on 2016/12/15.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
