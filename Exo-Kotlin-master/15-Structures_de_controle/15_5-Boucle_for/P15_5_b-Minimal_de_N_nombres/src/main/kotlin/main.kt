fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        val m = readln().toInt()
        list.add(m)
    }
    println(list.min())
    
}
