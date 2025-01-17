fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if (time > 127) {
            time = time
        }
        else if (time == 127) {
            time = 127
        }
        else if (time < -128) {
            time = -128
        }
    }
}
