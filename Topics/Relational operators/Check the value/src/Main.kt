const val MIN = 1
const val MAX = 9

fun main() {
    val value = readln().toInt()
    println(value in MIN..MAX)
}