fun tip(bill: Int, percentage: Int = 10): Int {
    val tip = bill * percentage / 100
    return tip
}

fun main() {
    println(tip(100))
    println(tip(100, 5))
}