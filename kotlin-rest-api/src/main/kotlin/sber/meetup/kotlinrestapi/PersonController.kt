package sber.meetup.kotlinrestapi

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class PersonController(private val personService: PersonService) {

    @GetMapping("/persons")
    fun getAllPerson(): List<Person?> = personService.getAllPersons()

    @GetMapping("/persons/{id}")
    fun getPersonById(@PathVariable id: Long): Person? = personService.getPearsonById(id)

    @PostMapping("/persons")
    @ResponseStatus(HttpStatus.CREATED)
    fun createPerson(@RequestBody person: Person) = personService.createPerson(person)

    @PutMapping("/persons/{id}")
    fun updatePersonById(@PathVariable id: Long, @RequestBody person: Person) = personService.updatePersonById(id, person)

    @DeleteMapping("/persons/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletePersonById(@PathVariable id: Long) = personService.deletePersonById(id)

}
