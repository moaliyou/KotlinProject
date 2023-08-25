package practice

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {

    override fun switchOn() {
        if (!isFolded)
            isScreenLightOn = true
    }

    fun foldPhone() {
        isFolded = true
    }

    fun unFoldPhone() {
        isFolded = false
    }

}