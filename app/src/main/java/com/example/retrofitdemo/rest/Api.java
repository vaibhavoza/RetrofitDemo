package com.example.retrofitdemo.rest;

import com.example.retrofitdemo.model.Hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
    String BASE_URL ="https://firebasestorage.googleapis.com/v0/b/my-project-1513841174895.appspot.com/o/";
            //"https://simplifiedcoding.net/demos/";
//https://firebasestorage.googleapis.com/v0/b/my-project-1513841174895.appspot.com/o/exercises.json?alt=media&token=1cf58492-c0a3-4c93-a637-99937c312fdd
    //@GET("marvel")
    @GET("exercises.json?alt=media&token=1cf58492-c0a3-4c93-a637-99937c312fdd")
    Call<List<Hero>> getHeroes();
}
