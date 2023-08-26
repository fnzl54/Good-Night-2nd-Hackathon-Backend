package com.techeer.goodnighthackathon.domain.review.domain.repository

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import com.techeer.goodnighthackathon.domain.review.domain.entity.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : JpaRepository<Review, Long> {

    @Query(value = "SELECT r FROM Review r WHERE r.movie.id = :id order by r.registrationDate DESC")
    fun findReviewById(id: Long): List<Review>

}