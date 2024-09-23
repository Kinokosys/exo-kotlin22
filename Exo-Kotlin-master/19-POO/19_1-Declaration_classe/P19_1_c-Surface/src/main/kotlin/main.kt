class Rectangle {
    var width: Int = 0
    var height: Int = 0
}

fun printArea(rectangle: Rectangle): Int {
    var Area: Int = rectangle.width * rectangle.height
    return Area
}

fun main() {
    val rectangle = Rectangle()
    rectangle.width = 5
    rectangle.height = 3
    println(printArea(rectangle))
}