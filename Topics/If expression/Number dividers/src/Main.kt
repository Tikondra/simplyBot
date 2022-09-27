const val DIVIDER2 = 2
const val DIVIDER3 = 3
const val DIVIDER5 = 5
const val DIVIDER6 = 6
const val ZERO = 0

fun main() {
    val a = readln().toInt()

    if (a % DIVIDER2 == ZERO) {
        println("Divided by $DIVIDER2")
    }
    if (a % DIVIDER3 == ZERO) {
        println("Divided by $DIVIDER3")
    }
    if (a % DIVIDER5 == ZERO) {
        println("Divided by $DIVIDER5")
    }
    if (a % DIVIDER6 == ZERO) {
        println("Divided by $DIVIDER6")
    }
}