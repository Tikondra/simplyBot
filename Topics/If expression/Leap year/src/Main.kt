const val ZERO = 0
const val HUNDRED = 100
const val FOUR = 4
const val FOUR_HUNDRED = 400

fun main() {
    val value = readln().toInt()
    if (value % FOUR == ZERO && value % HUNDRED != ZERO || value % FOUR_HUNDRED == ZERO) {
        println("Leap")
    } else println("Regular")
}