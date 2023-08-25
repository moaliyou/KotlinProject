package smart

class SmartHome(private val smartTvDevice: SmartTvDevice, private val smartLightDevice: SmartLightDevice) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if (!isSmartTvDeviceOn()) {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }
    }

    fun turnOffTv() {
        if (isSmartTvDeviceOn()) {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }

    fun increaseTvVolume() {
        if (isSmartTvDeviceOn())
            smartTvDevice.increaseSpeakerVolume()
    }

    fun decreaseTvVolume() {
        if (isSmartTvDeviceOn())
            smartTvDevice.decreaseVolume()
    }

    fun changeTvChannelToNext() {
        if (isSmartTvDeviceOn())
            smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrevious() {
        if (isSmartTvDeviceOn())
            smartTvDevice.previousChannel()
    }

    fun turnOnLight() {
        if (!isSmartLightDeviceOn()) {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if (isSmartLightDeviceOn()) {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if (isSmartLightDeviceOn())
            smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        if (isSmartLightDeviceOn())
            smartLightDevice.decreaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    fun printSmartTvInfo() {
        smartTvDevice.printDeviceInfo()
    }

    fun printSmartLightInfo() {
        smartLightDevice.printDeviceInfo()
    }

    fun isSmartTvDeviceOn(): Boolean {
        return smartTvDevice.deviceStatus == "on"
    }

    fun isSmartLightDeviceOn(): Boolean {
        return smartLightDevice.deviceStatus == "on"
    }

}