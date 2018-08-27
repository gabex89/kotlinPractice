package aquarium

/**
 * Created by SmoothSpark in 2018. 08. 27.
 *
 */

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishActions {
    fun eat()
}

abstract class AquariumFishes : FishActions {

    abstract val color: String
    override fun eat() = println("yumm")
}