package basics

fun main() {
    // calling greetMe() function
    var numOne = 8
    var numTwo = 3
    var numThree = 4
    greetMe()
    addTwoNumbers(9, 8)
    println("The square of 9 is ${squareOf(9)}")
    println("The sum of $numOne, $numTwo and $numThree is ${sumOf(numOne, numTwo, numThree)}")
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

// squareOf Method/Function
// this function takes a number and returns its square
fun squareOf(num: Int): Int{
    return (num * num)
}

// sumOf Method/Function
// this is anonymous functions
// its task is to sum 3 numbers
val sumOf: (Int, Int, Int) -> Int = { numOne, numTwo, numThree -> ( numOne + numTwo + numThree ) }