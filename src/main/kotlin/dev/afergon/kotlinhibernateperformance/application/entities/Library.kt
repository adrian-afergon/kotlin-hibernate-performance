package dev.afergon.kotlinhibernateperformance.application.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany

@Entity(name = "Library")
data class Library(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,
    @Column
    val name: String,
    @ManyToMany(fetch = LAZY)
    @JoinTable(
        name = "Library_Clients",
        joinColumns = [JoinColumn(name = "library_id")],
        inverseJoinColumns = [JoinColumn(name = "client_id")]
    )
    val clients: Set<Client> = setOf(),
    @ManyToMany(fetch = LAZY)
    @JoinTable(
        name = "Library_Comics",
        joinColumns = [JoinColumn(name = "library_id")],
        inverseJoinColumns = [JoinColumn(name = "comic_id")]
    )
    val comics: Set<Comic> = setOf()

)
