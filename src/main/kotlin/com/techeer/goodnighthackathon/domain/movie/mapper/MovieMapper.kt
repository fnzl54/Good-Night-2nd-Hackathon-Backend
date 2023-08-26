package com.techeer.goodnighthackathon.domain.movie.mapper

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseDetailInfo
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseInfo
import java.time.LocalDate


object MovieMapper {
    fun mapCreateMovieToEntity(movieCreateRequest: movieCreateRequest): Movie {
        return Movie(
            title = movieCreateRequest.title,
            genre = movieCreateRequest.genre,
            releaseDate = movieCreateRequest.releaseDate,
            endDate = movieCreateRequest.endDate,
            registrationDate = movieCreateRequest.registrationDate,
            isCurrentlyShowing = movieCreateRequest.isCurrentlyShowing,
            updateDate = LocalDate.now(),
            isActive = true
        )
    }

    fun mapCreateEntityToMovieInfo(movie: Movie): movieResponseInfo {
        return movieResponseInfo(
            title = movie.title
        )
    }

    fun mapCreateEntityToMovieDetailInfo(movie: Movie): movieResponseDetailInfo {
        return movieResponseDetailInfo(
            title = movie.title,
            genre = movie.genre,
            releaseDate = movie.releaseDate,
            endDate = movie.endDate,
            isCurrentlyShowing = movie.isCurrentlyShowing,
        )
    }


}