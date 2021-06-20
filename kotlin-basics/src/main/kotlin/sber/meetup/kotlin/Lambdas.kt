package sber.meetup.kotlin

// Функция высшего порядка
fun calculate(op1: Int, op2: Int, calLambda: (a: Int, b: Int) -> Int) {
    val res = calLambda(op1, op2)
    println(res)
}

fun main() {
    // Функция как объект первого класса, функциональный тип
    val sum: (a: Int, b: Int) -> Int = { a: Int, b: Int -> a + b }

    calculate(2, 3, sum)

    // Функция как объект первого класса, выведение типа
    val multiplication = { a: Int, b: Int -> a * b }

    calculate(2, 3, multiplication)
}
