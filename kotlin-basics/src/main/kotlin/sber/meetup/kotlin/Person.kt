package sber.meetup.kotlin

/*
Такое объявление одновременно создает поля класса,
конструктор с параметрами и инициализацию полей
 */
class Person(val name: String, val age: Int)

fun main() {
    // При создание инстансов класса new не пишется
    val john = Person("John Doe", 25)
    // Именованные параметры констуктора
    val jane = Person(name = "Jane Doe", age = 30)

    println("Person name: ${john.name}, person age: ${john.age}")

    println("Person name: ${jane.name}, person age: ${jane.age}")
}
