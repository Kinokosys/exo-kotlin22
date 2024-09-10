fun main() {
    val word = readln().toString()
    val alphabets: MutableList<Char> = mutableListOf()
    for (a in 'a'..'z') {
        alphabets.add(a)
    }
    for (lettre in alphabets) {
        if (lettre in word) {
            continue
        }
        print(lettre)
    }
}
