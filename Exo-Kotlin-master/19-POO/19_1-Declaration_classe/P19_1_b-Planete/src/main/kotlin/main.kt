class Planet (var star: String, var mass: Double, var numberOfSatellites: Int)

fun main() {
    val kotlinPlanet = Planet("Unknown Star", 1.0, 1)
    kotlinPlanet.star = "Java"
    kotlinPlanet.mass = 2.0
    kotlinPlanet.numberOfSatellites = 0

    println(kotlinPlanet.star)
    println(kotlinPlanet.mass)
    println(kotlinPlanet.numberOfSatellites)
}