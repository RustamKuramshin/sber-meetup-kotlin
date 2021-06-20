package sber.meetup.kotlin

fun main() {
    // Не изменяемая (final) переменная num (не может быть null)
    val num: Int = 1

    println(num)

    // Изменяемая переменная text (не может быть null)
    var text: String = "Hello, World"

    text = "Hello, Sber"

    println(text)
}
