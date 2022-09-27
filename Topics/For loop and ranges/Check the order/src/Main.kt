fun main() {
    val count = readln().toInt()
    var minValue = readln().toInt()
    var output = "YES"

    for (i in 1 until count) {
        val value = readln().toInt()

        if (value > minValue) {
            minValue = value
        } else {
            output = "NO"
            break
        }
    }

    println(output)
}