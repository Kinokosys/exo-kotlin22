class City(val name: String) {
    var population: Int = 0

    constructor(name: String, _population: Int) : this(name){
        population = _population
        if (population <= 0){
            population = 0
        }
        else if (population > 50_000_000){
            population = 50_000_000
        }
    }
}

fun main() {
    val goodCity = City("Good City", 65_000_000)
    val badCity = City("Bad City", 45_000_000)

    //badCity.population = 65_000_000
    println(badCity.population)

    //goodCity.population = 45_000_000
    println(goodCity.population)
}