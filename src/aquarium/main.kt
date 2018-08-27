package aquarium

/**
 * Created by SmoothSpark in 2018. 08. 26.
 *
 */

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val aquarium = Aquarium()

    println("Length: ${aquarium.length} " +
            "Width: ${aquarium.width} " +
            "Heigth: ${aquarium.heigth} ")

    aquarium.heigth = 80;

    println("Heigth: ${aquarium.heigth}")
    println("Volume: ${aquarium.volume}")


    val smallAquarium = Aquarium(length = 20, width = 15, heigth = 30)
    println("Length: ${smallAquarium.length} " +
            "Width: ${smallAquarium.width} " +
            "Heigth: ${smallAquarium.heigth} ")


    val smallAquarium2 = Aquarium(numberOfFish = 9)
}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}