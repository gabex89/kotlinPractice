/**
 * Created by SmoothSpark in 2018. 08. 13.
 *
 */

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    curriesSorter(spices)
    startWithCEndsWithE(spices)
    filteringTheFirst3Elements(spices)
}

fun curriesSorter(groceries: List<String>) {
    println(groceries.filter { it.contains("curry") }.sortedBy { it.length })
}

fun startWithCEndsWithE(groceries: List<String>) {
    println(groceries.filter { it.startsWith('c') && it.endsWith('e') })
}

fun filteringTheFirst3Elements(groceries: List<String>) {
    println(groceries.take(3).filter { it.startsWith('c') })
}