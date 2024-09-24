class Car(val make: String, val year: Int) {
    var speed: Int = 70
    fun accelerate(){
        speed += 5
    }
    fun decelerate() {
        speed -= 5
    }
}

fun main() {
    val myCar = Car("Mustang", 1976)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}