package com.semateckotlinproject.themoviedb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapterClass : RecyclerView.Adapter<MovieListAdapterClass.MovieListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return TestKotlinRecyclerViewHolder(v, activityFunction)
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
    }

    class MovieListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}