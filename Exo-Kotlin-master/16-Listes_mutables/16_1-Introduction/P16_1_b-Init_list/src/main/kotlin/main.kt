fun main() {
    val taille = 100
    val numbers = mutableListOf<Int>()
    for (num in 0..taille + 1) {
        numbers.add(0)
    }
    for (num in taille.indices(1))
        numbers.add(100)
        // do not touch the lines below
        println(numbers.joinToString())
}
