package com.techeer.goodnighthackathon.domain.movie.controller

import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateResponse
import com.techeer.goodnighthackathon.domain.movie.mapper.MovieMapper
import com.techeer.goodnighthackathon.domain.movie.service.MovieService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController(
    private val movieService: MovieService) {
    @PostMapping("/register")
    fun registerMovie(@RequestBody movieCreateRequest: movieCreateRequest): movieCreateResponse {
        val createdMovie = movieService.registerMovie(movieCreateRequest)
        return createdMovie
    }
}