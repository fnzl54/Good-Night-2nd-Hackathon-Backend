package com.techeer.goodnighthackathon.domain.movie.domain.repository

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : JpaRepository<Movie, Long> {

}