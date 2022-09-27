const val COUNT = 1

fun main() {
    val a: Char = readln().first()
    val b: Char = readln().first()
    val c: Char = readln().first()

    println(a + COUNT == b && b + COUNT == c)
}