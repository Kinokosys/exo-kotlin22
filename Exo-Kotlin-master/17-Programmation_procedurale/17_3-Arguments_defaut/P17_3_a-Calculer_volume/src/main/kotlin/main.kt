fun getVolume(length: Int, width: Int = 1, height: Int = 1): Int {
    val volume = length * width * height
    return volume
}

fun main() {
    println(getVolume(1))
}