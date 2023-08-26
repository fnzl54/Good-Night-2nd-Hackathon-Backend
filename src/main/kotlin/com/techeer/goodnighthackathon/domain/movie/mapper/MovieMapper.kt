package com.techeer.goodnighthackathon.domain.movie.mapper

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseInfo


object MovieMapper {
    fun mapCreateMovieToEntity(movieCreateRequest: movieCreateRequest): Movie {
        return Movie(
            title = movieCreateRequest.title,
            genre = movieCreateRequest.genre,
            releaseDate = movieCreateRequest.releaseDate,
            endDate = movieCreateRequest.endDate,
            registrationDate = movieCreateRequest.registrationDate,
            isCurrentlyShowing = movieCreateRequest.isCurrentlyShowing,
            isActive = true
        )
    }

    fun mapCreateEntityToMovieInfo(movie: Movie): movieResponseInfo {
        return movieResponseInfo(
            title = movie.title
        )
    }
}