package com.techeer.goodnighthackathon.domain.review.controller

import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseInfo
import com.techeer.goodnighthackathon.domain.review.dto.reveiwCreateRequest
import com.techeer.goodnighthackathon.domain.review.dto.reviewCreateResponse
import com.techeer.goodnighthackathon.domain.review.service.ReviewService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reviews")
class ReviewController(
    private val reviewService: ReviewService) {

    @PostMapping()
    fun registerReview(@RequestBody reveiwCreateRequest: reveiwCreateRequest): reviewCreateResponse {
        val createdReview = reviewService.registerReview(reveiwCreateRequest)
        return createdReview
    }
}