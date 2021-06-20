package sber.meetup.kotlin

class Dog {
    var name: String? = null
    var age: Int? = null

    init {
        // Какие-то действия инициализации
    }

    constructor() {
    }

    constructor(_name: String, _age: Int) {
        name = _name
        age = _age
    }

    override fun toString(): String {
        return "Dog[name=$name,age=$age]"
    }
}

fun main() {
    val dog1 = Dog()
    dog1.name = "Doggy1"
    dog1.age = 9

    println(dog1)

    val dog2 = Dog("Doggy2", 8)

    println(dog2)
}
