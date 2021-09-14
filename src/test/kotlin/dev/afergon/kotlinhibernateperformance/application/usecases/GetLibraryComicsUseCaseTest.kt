package dev.afergon.kotlinhibernateperformance.application.usecases

import dev.afergon.kotlinhibernateperformance.application.repositories.LibraryRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class GetLibraryComicsUseCaseTest {

    @Autowired
    lateinit var libraryRepository: LibraryRepository

    @Test
    fun `should returns list of comics in a library`() {
        val getLibraryComicsUseCase = GetLibraryComicsUseCase(libraryRepository)
        val result = getLibraryComicsUseCase.invoke(1L)
    }

}