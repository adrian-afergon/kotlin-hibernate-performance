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

@Entity
data class Client(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column
    val name: String,
    @Column
    val email: String,
//    @ManyToMany(fetch = LAZY)
//    @JoinTable(
//        name = "Client_Comics",
//        joinColumns = [JoinColumn(name = "client_id")],
//        inverseJoinColumns = [JoinColumn(name = "comic_id")]
//    )
//    val comics: MutableList<Comic> = mutableListOf(),
)
