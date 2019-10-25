package com.semateckotlinproject.themoviedb

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitProviderClass {

    companion object {

        fun provideRetrofit(): TheMoviedbInterface {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/search/movie?api_key=7ac72bd9edccc294270b0fb0981b7fb9")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(TheMoviedbInterface::class.java)
        }

    }
}