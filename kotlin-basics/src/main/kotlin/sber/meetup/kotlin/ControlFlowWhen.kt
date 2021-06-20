package sber.meetup.kotlin

import kotlin.random.Random

fun main() {
    // Получим какой-нибудь объект
    val obj: Any = getObjectFromBlackBox()

    when (obj) {
        1 -> println("one")
        in 10..20 -> println("a number from 10 to 20")
        is String -> print("object is string")
        else -> println("unknown object")
    }
}

fun getObjectFromBlackBox(): Any {
    return Random.nextInt()
}