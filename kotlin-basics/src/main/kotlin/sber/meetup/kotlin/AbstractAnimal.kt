package sber.meetup.kotlin

abstract class AbstractAnimal {
    abstract val name: String

    abstract fun say(): String
}

interface Runnable {
    fun run(): Unit
}

open class Mouse(override val name: String): AbstractAnimal(), Runnable {
    override fun say(): String {
        return "My name os $name"
    }

    override fun run() {
        println("I'm run")
    }
}

class ArcticMouse(val age: Int): Mouse("Arctic mouse") {

}
