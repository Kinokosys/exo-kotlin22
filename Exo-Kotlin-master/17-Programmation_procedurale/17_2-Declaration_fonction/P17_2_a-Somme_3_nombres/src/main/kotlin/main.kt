fun sum(first: Int, second: Int, third: Int){
    print(first + second + third)
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    return(sum(a, b, c))
}

