const val ZERO = 0
const val TWO = 2

fun main() {
    val a = readln().toInt()
    if (a % TWO == ZERO) {
        println("EVEN")
    } else println("ODD")
}