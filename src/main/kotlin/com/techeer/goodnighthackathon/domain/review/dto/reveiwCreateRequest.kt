package com.techeer.goodnighthackathon.domain.review.dto


data class reveiwCreateRequest (
    val movie_id: Long,
    val review: String,
    val rating: Int
)

