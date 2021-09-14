package dev.afergon.kotlinhibernateperformance.application.repositories

import dev.afergon.kotlinhibernateperformance.application.entities.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client, Long>