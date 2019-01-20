package com.ihuntto.retrofitweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {
    @GET("data/sk/{cityId}.html")
    Call<Weather> getCityWeather(@Path("cityId") String cityId);
}
