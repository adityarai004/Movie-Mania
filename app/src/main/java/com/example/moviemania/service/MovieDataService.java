package com.example.moviemania.service;

import com.example.moviemania.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    //end point movie/popular
    //base url https://api.themoviedb.org/3/
    //whole link  https://api.themoviedb.org/3/movie/popular?api_key=1086b7fd0d6cb4a9077cb32c2f905714
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
