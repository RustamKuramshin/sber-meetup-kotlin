package sber.meetup.kotlin

/*
 * Класс с функцией-членом.
 */
class Cat(val name: String) {
    fun sayName() {
        println("My name is $name")
    }
}

fun main() {
    val cat = Cat("Caty")

    cat.sayName()
}
