package com.project.proyek_akhir_mobile_programming.utils

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.proyek_akhir_mobile_programming.R

const val API_KEY = "e233fa429757eb2e60525c135a5c8d28"
const val BASE_URL = "https://api.themoviedb.org/3/"

const val BASE_URL_API_IMAGE = "https://image.tmdb.org/t/p/"
const val POSTER_SIZE_W185 = "w185"
const val POSTER_SIZE_W780 = "w780"

fun ImageView.loadImageMovie(url: Any?){
    Glide.with(this.context)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading_movie))
        .into(this)
}

fun ImageView.loadImageTvShow(url: Any?){
    Glide.with(this.context)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading_tvshow))
        .into(this)
}

fun Context.showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}