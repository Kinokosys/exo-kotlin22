fun isGreater(first: Int, second: Int, third: Int, fourth: Int): Boolean {
    if (first + second > third + fourth) {
        return true
    }
    else {
        return false
    }
}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
