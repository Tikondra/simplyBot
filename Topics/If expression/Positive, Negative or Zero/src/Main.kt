const val ZERO = 0
const val TWO = 2

fun main() {
    val a = readln().toInt()
    if (a == ZERO) {
        println("zero")
    } else if (a > ZERO) {
        println("positive")
    } else println("negative")
}
