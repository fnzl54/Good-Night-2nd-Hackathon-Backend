package com.techeer.goodnighthackathon.domain.review.controller

import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseDetailInfo
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseInfo
import com.techeer.goodnighthackathon.domain.review.domain.entity.Review
import com.techeer.goodnighthackathon.domain.review.dto.reveiwCreateRequest
import com.techeer.goodnighthackathon.domain.review.dto.reviewCreateResponse
import com.techeer.goodnighthackathon.domain.review.service.ReviewService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/reviews")
class ReviewController(
    private val reviewService: ReviewService) {

    @PostMapping()
    fun registerReview(@RequestBody reveiwCreateRequest: reveiwCreateRequest): reviewCreateResponse {
        val createdReview = reviewService.registerReview(reveiwCreateRequest)
        return createdReview
    }

    @GetMapping()
    fun findReview(@RequestParam("id") id: Long, @RequestParam("rating") rating: Int ): List<Review> {
        val findReview = reviewService.findReview(id, rating)
        return findReview
    }

}