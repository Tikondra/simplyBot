const val A = -15
const val B = 12
const val C = 14
const val D = 17
const val E = 19
const val ONE = 1

fun main() {
    val value = readln().toInt()
    if (value in A + ONE..B || value in C + ONE until D || value >= E) {
        println("True")
    } else println("False")
}