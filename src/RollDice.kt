import java.util.*

/**
 * Created by SmoothSpark in 2018. 08. 14.
 *
 */
fun main(args: Array<String>) {

    println(rollDice(readLine()?.toInt()))
}

fun rollDice(number: Int?): Int {
    return if (number != 0) (0..number!!).random() else 0
}

fun ClosedRange<Int>.random() =
        Random().nextInt((endInclusive + 1) - start) + start


val rollDice = { sides: Int ->
    Random().nextInt(sides) + 1
}

val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides) + 1
}

