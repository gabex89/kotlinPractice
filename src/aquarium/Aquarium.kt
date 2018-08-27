package aquarium

import kotlin.math.PI

/**
 * Created by SmoothSpark in 2018. 08. 15.
 *
 */
open class Aquarium(var length: Int = 100, var width: Int = 20, var heigth: Int = 40) : Any() {

    open var volume: Int
        get() = width * heigth * length / 1000
        set(value) {
            heigth = (value * 1000) / (width * length)
        }

    open var water = volume + 0.9

    constructor(numberOfFish: Int) : this() {

        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        heigth = (tank / (length * width)).toInt()

    }
}

class TowerTank() : Aquarium() {

    override var water = volume * 0.8

    override var volume: Int
        get() = (width * heigth * length / 1000 * PI).toInt()
        set(value) {
            heigth = (value * 1000) / (width * length)
        }
}