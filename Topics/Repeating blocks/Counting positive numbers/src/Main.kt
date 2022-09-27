const val ZERO = 0

fun main() {
    val count = readln().toInt()
    var positiveCount = ZERO

    repeat(count) {
        val value = readln().toInt()

        if (value > 0) positiveCount += 1
    }

    println(positiveCount)
}