package sber.meetup.kotlin

import kotlin.random.Random

fun main() {
    val text = if (Random.nextInt()%2 == 0) "even" else "odd"

    println(text)
}
