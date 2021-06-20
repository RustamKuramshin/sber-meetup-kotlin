package sber.meetup.kotlin

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

fun printSum1(a: Int, b: Int): Unit {
    println(a + b)
}

fun printSum2(a: Int, b: Int): Unit {
    println(a + b)
}

fun main() {
    println(sum1(2,2))
    println(sum2(2,2))

    printSum1(2,2)
    printSum2(2,2)
}
