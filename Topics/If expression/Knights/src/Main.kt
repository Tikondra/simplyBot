import kotlin.math.abs

fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    if (abs(y2 - y1) == 1 && abs(x2 - x1) == 2 || abs(y2 - y1) == 2 && abs(x2 - x1) == 1) {
        println("YES")
    } else println("NO")
}