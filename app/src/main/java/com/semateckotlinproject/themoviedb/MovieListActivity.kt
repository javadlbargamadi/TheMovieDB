package com.semateckotlinproject.themoviedb

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val movieName = edtMovieName.text.toString()
        val list : ArrayList<String>

//        RetrofitProviderClass.provideRetrofit().getMovieList(movieName)
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                Toast.makeText(this, "Isha : ${it.results}", Toast.LENGTH_LONG).show()
//            }, {
//                Toast.makeText(this, "Failed : ${it.message}", Toast.LENGTH_LONG).show()
//            })

    }
}
