import kotlin.math.abs

fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }

    if (x1 == x2 || y1 == y2) {
        println("YES")
    } else if (abs(x1 - x2) == abs(y1 - y2)) {
        println("YES")
    } else println(" NO")
}