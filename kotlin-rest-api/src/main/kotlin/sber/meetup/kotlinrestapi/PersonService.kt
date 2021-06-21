package sber.meetup.kotlinrestapi

interface PersonService {
    fun createPerson(person: Person): Person
    fun getAllPersons(): List<Person?>
    fun getPearsonById(id: Long): Person?
    fun updatePersonById(id: Long, person: Person): Person
    fun deletePersonById(id: Long): Unit
}