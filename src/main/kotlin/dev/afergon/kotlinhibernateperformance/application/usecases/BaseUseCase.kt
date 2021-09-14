package dev.afergon.kotlinhibernateperformance.application.usecases

interface BaseUseCase<in I, out O> {
    operator fun invoke(input: I): O
}