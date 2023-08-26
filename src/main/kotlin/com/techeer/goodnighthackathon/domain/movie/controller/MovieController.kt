package com.techeer.goodnighthackathon.domain.movie.controller

import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieRemoveRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseInfo
import com.techeer.goodnighthackathon.domain.movie.dto.movieUpdateRequest
import com.techeer.goodnighthackathon.domain.movie.service.MovieService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController(
    private val movieService: MovieService) {
    @PostMapping()
    fun registerMovie(@RequestBody movieCreateRequest: movieCreateRequest): movieResponseInfo {
        val createdMovie = movieService.registerMovie(movieCreateRequest)
        return createdMovie
    }

    @DeleteMapping()
    fun removeMovie(@RequestBody movieRemoveRequest: movieRemoveRequest): movieResponseInfo {
        val removeMovie = movieService.removeMovie(movieRemoveRequest)
        return removeMovie
    }

    @PutMapping()
    fun updateMovie(@RequestBody movieUpdateRequest: movieUpdateRequest): movieResponseInfo {
        val updateMovie = movieService.updateMovie(movieUpdateRequest)
        return updateMovie
    }
}