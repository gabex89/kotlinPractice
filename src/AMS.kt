import java.util.*

/**
 * Created by SmoothSpark in 2018. 08. 07.
 *
 */
fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    dayOfWeek()
    println("----------First assignment----------------")
    println("----------arg: Kotlin----------------")
    firstAssignment()

    println()
    println("----------Second assignment----------------")
    println("----------arg: 14----------------")
    secondAssignment(args[1])

    println()
    println("----------Third assignment -----------------")
    println("----------arg: -----------------")
    feedFist()

    println()
    println("----------Fourth assignment -----------------")
    println("----------arg: -----------------")
    println(getFortuneCookie())

    println()
    println("----------Fifth assignment -----------------")
    println("----------arg: -----------------")
    println(shouldChangeWater(randomDay()))

}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {


    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isSunday(day: String) = day == "Sunday"

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30


private fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    println("Enter your birthday")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}

fun feedFist() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day adn the fish eat $food ")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day)) {
        println("Change the water")
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun dayOfWeek() {
    println("What day is it today?")

    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        Calendar.SUNDAY -> println("Sunday")
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesday")
        Calendar.WEDNESDAY -> println("Wednesday")
        Calendar.THURSDAY -> println("Thursday")
        Calendar.FRIDAY -> println("Friday")
        Calendar.SATURDAY -> println("Saturday")
        else -> "Time has stopped"
    }
}

fun firstAssignment() {
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val msg = "You are ${if (temperature > 50) "fried" else "safe"}"
    println(msg)
}

fun secondAssignment(time: String) {
    println("Good ${if (time.toInt() < 12) "morning" else "night"} Kotlin")
}