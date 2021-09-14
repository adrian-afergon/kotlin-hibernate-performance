package dev.afergon.kotlinhibernateperformance.application.usecases

import dev.afergon.kotlinhibernateperformance.application.entities.Comic
import dev.afergon.kotlinhibernateperformance.application.repositories.LibraryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GetLibraryComicsUseCase(
    @Autowired private val libraryRepository: LibraryRepository,
): BaseUseCase<Long, Set<Comic>> {
    override fun invoke(input: Long): Set<Comic> {
        libraryRepository.findAll()
        return setOf()
    }
}