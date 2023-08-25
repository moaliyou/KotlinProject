package practice

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    val price = when {

        age in 1..12 -> 15
        age in 13..60 && isMonday -> 25
        age in 13..60 -> 30
        age in 61..100 -> 20
        else -> -1

    }

    return price

}
