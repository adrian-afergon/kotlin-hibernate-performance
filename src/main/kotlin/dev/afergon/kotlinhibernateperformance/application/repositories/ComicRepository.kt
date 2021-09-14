package dev.afergon.kotlinhibernateperformance.application.repositories

import dev.afergon.kotlinhibernateperformance.application.entities.Comic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ComicRepository : JpaRepository<Comic, Long>