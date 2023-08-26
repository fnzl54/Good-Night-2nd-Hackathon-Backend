package com.techeer.goodnighthackathon.domain.review.service

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.movie.domain.repository.MovieRepository
import com.techeer.goodnighthackathon.domain.movie.dto.movieCreateRequest
import com.techeer.goodnighthackathon.domain.movie.dto.movieResponseDetailInfo
import com.techeer.goodnighthackathon.domain.movie.mapper.MovieMapper
import com.techeer.goodnighthackathon.domain.review.domain.entity.Review
import com.techeer.goodnighthackathon.domain.review.domain.repository.ReviewRepository
import com.techeer.goodnighthackathon.domain.review.dto.reviewCreateResponse
import com.techeer.goodnighthackathon.domain.review.dto.reveiwCreateRequest
import com.techeer.goodnighthackathon.domain.review.mapper.ReviewMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReviewService @Autowired constructor(
    private val ReviewRepository: ReviewRepository,
    private val MovieRepository: MovieRepository
){
    fun registerReview(reveiwCreateRequest: reveiwCreateRequest): reviewCreateResponse {
        val movie = MovieRepository.findMovieById(reveiwCreateRequest.movie_id)
        val newReview = ReviewMapper.mapCreateReviewToEntity(reveiwCreateRequest, movie)
        val saveReview = ReviewRepository.save(newReview)
        return ReviewMapper.mapCreateEntityToReviewInfo(saveReview)
    }

    fun findReview(movieId: Long): List<Review> {
        val findReview = ReviewRepository.findReviewById(movieId)
        return  findReview
    }

}


