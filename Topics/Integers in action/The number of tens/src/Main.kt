const val SECONDS = 3600
const val COUNT = 60
const val HOURS = 24

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000
    val calc1 = totalSeconds / 3600
    val calc2 = (totalSeconds % 3600) / 60
    val calc3 = (totalSeconds % 3600) % 60


}