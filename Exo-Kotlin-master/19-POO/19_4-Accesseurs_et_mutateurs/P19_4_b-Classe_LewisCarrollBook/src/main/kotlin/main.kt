class LewisCarrollBook(val name: String = "", val author: String = "Lewis Carroll", val price: Int = 0)


fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
}