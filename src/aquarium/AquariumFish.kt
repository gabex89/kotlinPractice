package aquarium

/**
 * Created by SmoothSpark in 2018. 08. 27.
 *
 */

abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {

    override fun eat() {
        println("Hunt and eat fish")
    }

    override val color: String = "gray"
}

class Plecostomus : AquariumFish(), FishAction {
    override fun eat() {
        println("Munch on algae")
    }

    override val color: String = "gold"
}

interface FishAction {
    fun eat()
}