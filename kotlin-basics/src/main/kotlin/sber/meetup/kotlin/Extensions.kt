// Kotlin
package sber.meetup.kotlin

fun String.firstChar(): Char {
    return this[0]
}

fun main() {
    val text = "Hello, World"
    val firstChar = text.firstChar()

    println("Hello, World".firstChar())
}
