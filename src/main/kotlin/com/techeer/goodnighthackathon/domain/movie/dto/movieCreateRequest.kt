package com.techeer.goodnighthackathon.domain.movie.dto

import java.time.LocalDate

data class movieCreateRequest(
    val title: String,
    val genre: String,
    val releaseDate: LocalDate,
    val registrationDate: LocalDate,
    val endDate: LocalDate,
    val isCurrentlyShowing: Boolean
)