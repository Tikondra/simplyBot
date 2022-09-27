fun main() {
    val count = readln().toInt()
    var minValue = readln().toInt()

    for (i in 1 until count) {
        val value = readln().toInt()

        if (value < minValue) {
            minValue = value
        }
    }

    println(minValue)
}