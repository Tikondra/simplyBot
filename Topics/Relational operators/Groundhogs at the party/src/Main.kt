const val A = 10
const val B = 15
const val C = 20
const val D = 25

fun main() {
    val cups = readln().toInt()
    val isWeekend = readln().toBoolean()

    println(!isWeekend && cups in A..C || isWeekend && cups in B..D)
}