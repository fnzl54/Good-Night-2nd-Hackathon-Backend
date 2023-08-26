package com.techeer.goodnighthackathon.domain.movie.domain.repository

import com.techeer.goodnighthackathon.domain.movie.domain.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

//
//val title: String,
//val genre: String
@Repository
interface MovieRepository : JpaRepository<Movie, Long> {
    @Query(value = "SELECT m FROM Movie m WHERE m.title = :title AND m.genre = :genre")
    fun findMovieByTitleGenre(title: String, genre: String): Movie

    @Query(value = "SELECT m FROM Movie m WHERE m.id = :id")
    fun findMovieByTitleGenre(id: Long): Movie

}