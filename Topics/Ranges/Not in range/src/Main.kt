const val ONE = 1
const val TEN = 10

fun main() {
    val a = readln().toInt()

    println(a !in ONE..TEN)
}