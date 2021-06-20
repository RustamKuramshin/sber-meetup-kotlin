package sber.meetup.kotlin

import kotlin.random.Random

fun main() {
    val numType: String
    val randomNum = Random.nextInt()

    if (randomNum%2 == 0) {
        numType = "even"
    } else {
        numType = "odd"
    }

    println("Number $randomNum $numType")
}
