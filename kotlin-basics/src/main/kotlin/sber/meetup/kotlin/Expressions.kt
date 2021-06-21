// Kotlin
package sber.meetup.kotlin

import kotlin.random.Random

fun main() {
    // Пример с if else
    val randInt = Random.nextInt()

    val numType = if (randInt%2 == 0) "even" else "odd"

    // Пример с when
    val numType2 = when {
        randInt%2 == 0 -> "even"
        else -> "odd"
    }

    // Пример с try catch
    val randInt2 = try {
        Random.nextInt()
    } catch (e: Exception) {
        0
    }
}
