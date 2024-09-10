fun main() {
    println(findYears(650000.0))
}



fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    do {
        deposit *= 1.071
        years += 1
    } while (50000 < deposit && deposit < 700000) ;
    return years
}