package com.semateckotlinproject.themoviedb

import com.semateckotlinproject.themoviedb.MovieListClass.MovieListClass
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMoviedbInterface {

    @GET("&query=Jack+Reacher")
    fun getMovieList(@Query("query") movieName: String): Observable<MovieListClass>
}

//https://api.themoviedb.org/3/search/movie?api_key=7ac72bd9edccc294270b0fb0981b7fb9