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
    fun findMovieById(id: Long): Movie

    @Query(value = "SELECT m FROM Movie m WHERE m.genre ILike %:genre% order by m.releaseDate")
    fun findMovieByGenre(genre: String): List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.isCurrentlyShowing = true order by m.releaseDate")
    fun findMovieByIsCurrentlyShowingT(): List<Movie>

    @Query(value = "SELECT m FROM Movie m WHERE m.isCurrentlyShowing = false order by m.releaseDate")
    fun findMovieByIsCurrentlyShowingF(): List<Movie>

}