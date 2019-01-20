package com.ihuntto.retrofitweather;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherRepository {
    private static final String BASE_URL = "http://www.weather.com.cn/";
    private WeatherService mWeatherService;

    private WeatherRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mWeatherService = retrofit.create(WeatherService.class);
    }

    private static class SingletonHolder {
        private static final WeatherRepository INSTANCE = new WeatherRepository();
    }

    public static WeatherRepository getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public WeatherService getWeatherService() {
        return mWeatherService;
    }
}
