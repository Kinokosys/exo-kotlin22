class Complex(var real: Double, var image: Double)

fun main() {
    val number1 = Complex(0.0,0.0)
    number1.real = 5.0
    number1.image = 2.0
    println(number1.real)
    println(number1.image)
}