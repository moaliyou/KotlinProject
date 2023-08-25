package functions

fun main() {

    val trickFunction = trick

    trickFunction()
    treat()

    val sum = addTwoNumbers(4, 5)
    println(sum)

    println(addThreeNumbers(5, addTwoNumbers))

}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

val addTwoNumbers: (numOne: Int, numTwo: Int) -> Int = {
    numOne, numTwo -> numOne + numTwo
}

fun addThreeNumbers(numThree: Int, addTwoNumbers: (Int, Int) -> Int): Int {
    return numThree + addTwoNumbers(3, 2)
}