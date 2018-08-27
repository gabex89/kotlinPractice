/**
 * Created by SmoothSpark in 2018. 08. 15.
 *
 */
class SimpleSpice {

    val name: String = "curry"
    val level: String = "mild"
    val heat: Int
        get() {
            return if (level == "mild") 5 else 1
        }


}

fun main(args: Array<String>) {
    var spice = SimpleSpice()

    println("Name of the spice: ${spice.name} \n"
            + "and it's heat is: ${spice.heat}")
}
