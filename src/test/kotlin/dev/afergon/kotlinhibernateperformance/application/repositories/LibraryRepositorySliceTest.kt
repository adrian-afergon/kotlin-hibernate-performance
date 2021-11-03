package dev.afergon.kotlinhibernateperformance.application.repositories

import dev.afergon.kotlinhibernateperformance.application.entities.Library
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class LibraryRepositorySliceTest {

    @Autowired
    lateinit var libraryRepository: LibraryRepository

    @Test
    fun `should returns list of libraries`() {

        libraryRepository.save(Library(name = "irrelevant name"))

        val actual = libraryRepository.findAll()

        assertEquals(actual.size, 1)
    }

}