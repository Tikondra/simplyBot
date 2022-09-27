const val ZERO = 0
const val FOUR = 4

fun main() {
    val count = readln().toInt()
    var max = ZERO

    repeat(count) {
        val value = readln().toInt()

        if (value % FOUR == ZERO && value > max) max = value
    }

    println(max)
}