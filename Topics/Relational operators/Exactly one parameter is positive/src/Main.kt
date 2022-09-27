const val ZERO = 0

fun main() {
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()

    println(
        h1 > ZERO && h2 <= ZERO && h3 <= ZERO ||
            h1 <= ZERO && h2 > ZERO && h3 <= ZERO ||
            h1 <= ZERO && h2 <= ZERO && h3 > ZERO
    )
}