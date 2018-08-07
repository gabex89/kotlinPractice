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

}

fun getFortuneCookie(): String {

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