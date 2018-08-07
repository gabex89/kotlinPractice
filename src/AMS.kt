import java.util.*

/**
 * Created by SmoothSpark in 2018. 08. 07.
 *
 */
fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    dayOfWeek()
    println("----------arg: Kotlin----------------")
    firstAssignment()
    println("----------arg: 14----------------")
    secondAssignment(args[1])

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