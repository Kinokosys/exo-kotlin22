fun isVowel(let: Char): Boolean {
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    for (vow in vowel) {
        if (let == vow) {
            return true
        }
    }
    return false
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
