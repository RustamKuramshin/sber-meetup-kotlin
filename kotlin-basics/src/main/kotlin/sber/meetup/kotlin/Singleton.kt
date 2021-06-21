package sber.meetup.kotlin

fun main() {
    // Создаем объект
    val person = object {
        val name: String = "John Doe"
        val age: Int = 33

        override fun toString(): String {
            return "Person[name=$name, age=$age]"
        }
    }

    println(person)
}

