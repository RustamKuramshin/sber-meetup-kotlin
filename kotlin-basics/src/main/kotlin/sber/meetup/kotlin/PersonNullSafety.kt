// Kotlin
package sber.meetup.kotlin

class PersonNullSafety(val name: String?)

fun main() {
    val personNullSafety = PersonNullSafety(null)

    println(personNullSafety.name?.length)

    val nameLength = personNullSafety.name?.length ?: 0

    personNullSafety.name.let {
        println(it)
    }
}