package classAndObject

class SmartDevice {

    val deviceName = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    var speakerVolum = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn() {
        println("turning on the device")
    }

    fun turnOff() {
        println("turning off the device")
    }

}