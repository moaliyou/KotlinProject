package basics

fun main() {
    // calling greetMe() function
    greetMe()
    addTwoNumbers(9, 8)
}

// Greeting Method
// this function has no return type or arguments
fun greetMe(){
    println("Hi, Mahmoud")
}

// addTwoNumbers Method/Function
// this function has two integer arguments with no return type
// it's task is to add two integer (Whole Number) numbers
fun addTwoNumbers(numOne: Int, numTwo: Int){
    println("The sum of $numOne + $numTwo = " + (numOne + numTwo))
}