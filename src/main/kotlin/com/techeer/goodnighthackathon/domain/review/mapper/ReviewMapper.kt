package com.techeer.goodnighthackathon.domain.review.mapper

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.movie.domain.repository.MovieRepository
import com.techeer.goodnighthackathon.domain.review.domain.entity.Review
import com.techeer.goodnighthackathon.domain.review.dto.reveiwCreateRequest
import com.techeer.goodnighthackathon.domain.review.dto.reviewCreateResponse
import org.springframework.beans.factory.annotation.Autowired
import java.time.LocalDate

object ReviewMapper {
    fun mapCreateReviewToEntity(reveiwCreateRequest: reveiwCreateRequest, movie: Movie): Review {
        return Review(
            movie = movie,
            review = reveiwCreateRequest.review,
            rating = reveiwCreateRequest.rating,
            registrationDate = LocalDate.now()
        )
    }

    fun mapCreateEntityToReviewInfo(review: Review): reviewCreateResponse {
            return reviewCreateResponse(
                title = review.movie.title,
                review = review.review,
                rating = review.rating
            )
    }
}