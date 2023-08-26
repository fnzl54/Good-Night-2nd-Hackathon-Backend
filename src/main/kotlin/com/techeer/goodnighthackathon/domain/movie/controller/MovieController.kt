package com.techeer.goodnighthackathon.domain.movie.controller

import com.techeer.goodnighthackathon.domain.movie.dto.*
import com.techeer.goodnighthackathon.domain.movie.service.MovieService
import org.springframework.web.bind.annotation.*

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

    @GetMapping()
    fun findMovieOne(
        @RequestParam("id") id: Long,
    ): movieResponseDetailInfo {
        val findMovie = movieService.findOneMovie(id)
        return findMovie
    }
}