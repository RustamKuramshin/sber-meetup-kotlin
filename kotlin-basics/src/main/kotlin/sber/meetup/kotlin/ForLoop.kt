package sber.meetup.kotlin

fun main() {
    val items = listOf("apple", "banana", "kiwi")

    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println(items[index])
    }
}
