package com.techeer.goodnighthackathon.domain.movie.service

import com.techeer.goodnighthackathon.domain.movie.domain.repository.MovieRepository
import com.techeer.goodnighthackathon.domain.movie.dto.*
import com.techeer.goodnighthackathon.domain.movie.mapper.MovieMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieService @Autowired constructor(
    private val movieRepository: MovieRepository) {
    fun registerMovie(movieCreateRequest: movieCreateRequest): movieResponseInfo {
        val newMovie = MovieMapper.mapCreateMovieToEntity(movieCreateRequest)
        val saveMovie = movieRepository.save(newMovie)
        return MovieMapper.mapCreateEntityToMovieInfo(saveMovie)
    }

    fun removeMovie(movieRemoveRequest: movieRemoveRequest): movieResponseInfo {
        val findMovie = movieRepository.findMovieByTitleGenre(movieRemoveRequest.title, movieRemoveRequest.genre)
        findMovie.remove()
        val removeMovie = movieRepository.save(findMovie)
        return MovieMapper.mapCreateEntityToMovieInfo(removeMovie)
    }
    fun updateMovie(movieUpdateRequest: movieUpdateRequest): movieResponseInfo {
        val findMovie = movieRepository.findMovieById(movieUpdateRequest.id)
        findMovie.update(movieUpdateRequest.title, movieUpdateRequest.genre, movieUpdateRequest.releaseDate, movieUpdateRequest.endDate)
        val updateMovie = movieRepository.save(findMovie)
        return MovieMapper.mapCreateEntityToMovieInfo(updateMovie)
    }

    fun findOneMovie(id: Long): movieResponseDetailInfo {
        val findMovie = movieRepository.findMovieById(id)
        return MovieMapper.mapCreateEntityToMovieDetailInfo(findMovie)
    }
}
