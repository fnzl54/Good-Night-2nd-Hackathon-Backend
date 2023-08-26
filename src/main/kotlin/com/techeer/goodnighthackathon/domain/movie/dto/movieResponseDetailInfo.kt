package com.techeer.goodnighthackathon.domain.movie.dto

import java.time.LocalDate

data class movieResponseDetailInfo(
    val title: String,
    val genre: String,
    val releaseDate: LocalDate,
    val endDate: LocalDate,
    val isCurrentlyShowing: Boolean
)