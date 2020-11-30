package com.example.lex.testcourse;


import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static PhisixApi phisixApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.phisix-api3.appspot.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        phisixApi = retrofit.create(PhisixApi.class);


    }

    public static PhisixApi getApi() {
        return phisixApi;
    }
}