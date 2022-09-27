const val ZERO = 0

fun main() {
    val count = readln().toInt()
    var ok = ZERO
    var bad = ZERO
    var toFix = ZERO

    repeat(count) {
        val value = readln().toInt()
        if (value == ZERO) {
            ok++
        } else if (value > ZERO) {
            toFix++
        } else bad++
    }

    println("$ok $toFix $bad")
}