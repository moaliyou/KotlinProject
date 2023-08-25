package smart

fun main() {
    val smartHome = SmartHome(
        SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment"),
        SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
    )

    smartHome.turnOnTv()
    smartHome.turnOnLight()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
    println()

    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()
    println()

    smartHome.increaseTvVolume()
    smartHome.changeTvChannelToNext()
    smartHome.increaseLightBrightness()
    println()

    smartHome.decreaseTvVolume()
    smartHome.decreaseLightBrightness()
    smartHome.changeTvChannelToPrevious()
    println()

    smartHome.turnOffAllDevices()
    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
}