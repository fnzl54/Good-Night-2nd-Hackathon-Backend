package com.techeer.goodnighthackathon.domain.movie.dto

import java.time.LocalDate

data class movieUpdateRequest(
    val id: Long,
    val title: String,
    val genre: String,
    val releaseDate: LocalDate,
    val endDate: LocalDate,
)