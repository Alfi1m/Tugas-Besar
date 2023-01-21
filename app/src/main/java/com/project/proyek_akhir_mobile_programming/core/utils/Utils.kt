package com.project.proyek_akhir_mobile_programming.core.utils

import com.project.proyek_akhir_mobile_programming.core.data.remote.response.MovieResponse
import com.project.proyek_akhir_mobile_programming.core.data.remote.response.TvShowResponse
import com.project.proyek_akhir_mobile_programming.core.domain.model.Movie
import com.project.proyek_akhir_mobile_programming.core.domain.model.TvShow

fun mapMovieResponseToDomain(input: MovieResponse) =
    Movie(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
fun mapTvShowResponseToDomain(input: TvShowResponse) =
    TvShow(
        input.id,
        input.name,
        input.desc,
        input.poster,
        input.imgPreview,
        input.releaseDate
    )
