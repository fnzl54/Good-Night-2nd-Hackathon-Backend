package com.techeer.goodnighthackathon.domain.movie.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class Movie(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null, // 영화 고유 ID

    val title: String, // 영화 제목
    val genre: String, // 영화 장르
    val releaseDate: LocalDate, // 영화 개봉일
    val endDate: LocalDate, // 영화 상영 종료일
    val registrationDate : LocalDate, // 영화 등록일
    val isCurrentlyShowing: Boolean // 현재 상영 중 여부
)