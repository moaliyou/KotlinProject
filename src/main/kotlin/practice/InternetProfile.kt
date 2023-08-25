package practice

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        if (hasReferrer()) {
            println("Name : ${this.name}")
            println("Age : ${this.age}")
            println("Likes to ${this.hobby}. " +
                    "Has a referrer named ${this.referrer?.name}, " +
                    "who likes to ${this.referrer?.hobby}."
            )
        } else {
            println("Name : ${this.name}")
            println("Age : ${this.age}")
            println("Likes to ${this.hobby}. Doesn't have a referrer.")
        }
    }

    private fun hasReferrer(): Boolean {
        return referrer != null
    }

}
