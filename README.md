# Kotlin + Spring + JPA

The main goal of this repository is just to show some examples about how to use Kotlin with Spring.
At the repository you will be able to found some files that will reflect many aspects of the software development:
 - Testing
 - Architecture
 - Performance
 - BDD

## The source code is not death
Of course that time to time this code will be updated adding more example, improving code, changing the behaviour, 
or just changing the approach based on the experiences that I'll get every day.

## Requirements
- Docker and docker-compose
- Kotlin
- Gradle

## How to run
First you will need to setup the environment. Currently you just need to turn up the postgresql server using the docker-compose file:
`docker-compose up`

For running the application you can use the typical gradle commands:
`gradle test`
`gradle build`

If you use Intellij IDEA, the project is fully integrated.

## Examples

- [Slice tests](https://github.com/adrian-afergon/kotlin-hibernate-performance/blob/main/src/test/kotlin/dev/afergon/kotlinhibernateperformance/application/repositories/LibraryRepositorySliceTest.kt)