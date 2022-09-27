const val MIN = 18
const val MAX = 59

fun main() {
    val age = readln().toInt()
    println(age in MIN..MAX)
}