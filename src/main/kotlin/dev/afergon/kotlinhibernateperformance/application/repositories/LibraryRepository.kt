package dev.afergon.kotlinhibernateperformance.application.repositories

import dev.afergon.kotlinhibernateperformance.application.entities.Library
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LibraryRepository : JpaRepository<Library, Long>