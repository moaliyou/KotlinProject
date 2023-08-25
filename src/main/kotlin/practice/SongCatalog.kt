package practice

class Song(

    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int

) {

    val isPopular get() = if (playCount > 999) {"Yes"} else {"No"}

    var songTitle = title

    fun printSongDescription() {
        println("${this.title}, performed by ${this.artist}, was released in ${this.yearPublished}")
    }

}

fun main() {

    val songOne = Song("All Of Me", "John Legend", 2013, 890)
    val songTwo = Song("Perfect", "Ed Sheeran", 2017, 120)


    songOne.printSongDescription()
    println("Is `${songOne.songTitle}` popular? ${songOne.isPopular}")
    println()

    songTwo.printSongDescription()
    println("Is `${songTwo.songTitle}` popular song? ${songTwo.isPopular}")
    println()


}