package sber.meetup.kotlin

fun main() {
    val obj: Any = "Hello, world"

    if (obj is String) {
        println(obj.length)
    }
}
