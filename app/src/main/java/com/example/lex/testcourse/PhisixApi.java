package com.example.lex.testcourse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lex on 02.02.18.
 */

public interface PhisixApi {
    @GET("/stocks.json/")
    Call<Course> getData();
}