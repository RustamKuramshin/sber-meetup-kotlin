package sber.meetup.kotlin

import kotlin.random.Random

fun main() {
    // Переменная text может получить значение "even number" или быть null
    val text: String? = if (Random.nextInt()%2 == 0) "even number" else null

    println("Text length equals ${text?.length}")

    // Переменная num объявлена как nullable
    var num: Int? = 1
    num = null

    println(num)
}
