package sber.meetup.kotlinrestapi

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class PersonServiceImpl : PersonService {

    override fun createPerson(person: Person): Person = person.copy(id = Random.nextLong())

    override fun getAllPersons(): List<Person?> =
        listOf(
            Person(id = 345345, name = "John Doe", age = 33),
            Person(id = 454, name = "Jane Doe", age = 23)
        )

    override fun getPearsonById(id: Long): Person? = Person(id = id, name = "John Doe", age = 33)

    override fun updatePersonById(id: Long, person: Person): Person = person.copy(id = id)

    override fun deletePersonById(id: Long) {
        // ... что-то делаем
    }
}