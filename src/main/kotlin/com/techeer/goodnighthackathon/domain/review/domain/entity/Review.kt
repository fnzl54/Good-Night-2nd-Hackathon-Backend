package com.techeer.goodnighthackathon.domain.review.domain.entity

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Review(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    val movie: Movie, // 영화와의 관계

    val review: String, // 리뷰 내용
    val rating: Int, // 평점
    val registrationDate : LocalDate // 리뷰 등록일
)