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

    var title: String, // 영화 제목
    var genre: String, // 영화 장르
    var releaseDate: LocalDate, // 영화 개봉일
    var endDate: LocalDate, // 영화 상영 종료일
    val registrationDate : LocalDate, // 영화 등록일
    var isCurrentlyShowing: Boolean, // 현재 상영 중 여부
    var isActive: Boolean, // 삭제 여부 판
    var updateDate : LocalDate
) {
    fun remove() {
        this.isActive = false
        this.updateDate = LocalDate.now()
    }

    fun update(title: String, genre: String, releaseDate: LocalDate, endDate: LocalDate) {
        this.title = title
        this.genre = genre
        this.releaseDate =releaseDate
        this.endDate = endDate
        this.updateDate = LocalDate.now()
    }
}

