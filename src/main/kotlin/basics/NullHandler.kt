package basics

fun main() {
    var favoriteActor: String? = "Sandra Oh"
//    favoriteActor = null

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}