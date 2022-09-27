const val DOUBLE = 2
const val ONE = 1

fun main() {
    val duration = readln().toInt()
    val food = readln().toInt() * duration
    val fly = readln().toInt() * DOUBLE
    val hotel = readln().toInt() * (duration - ONE)

    println(food + fly + hotel)
}