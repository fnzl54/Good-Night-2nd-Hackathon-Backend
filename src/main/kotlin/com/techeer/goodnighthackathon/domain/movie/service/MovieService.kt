package com.techeer.goodnighthackathon.domain.movie.service

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.movie.domain.repository.MovieRepository
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateResponse
import com.techeer.goodnighthackathon.domain.movie.mapper.MovieMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieService @Autowired constructor(
    private val movieRepository: MovieRepository) {
    fun registerMovie(movieCreateRequest: movieCreateRequest): movieCreateResponse {
        val newMovie = MovieMapper.mapCreateMovieToEntity(movieCreateRequest)
        val saveMovie = movieRepository.save(newMovie)
        return MovieMapper.mapCreateEntityToMovieInfo(saveMovie)
    }
}
