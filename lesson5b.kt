class Circle {
    // Properties
    var radius = 7
    var pie = 3.142

    // Behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius * radius

        println("The area of the circle is: " + areaOfCircle )
    }

    fun circleCircumference (){
        val circumference = 2 * pie * radius

        println("The circumference of the circle is: " + circumference)
    }
}

// Create a class for a rectangle and find the area as well as the perimeter of the rectangle.

class Rectangle {
    // Properties
    var length = 60
    var width = 30

    // behavious

    fun areaOfRectangle() {
        val answerArea = length * width
        println("The area of the rectangle is: " + answerArea)
    }

    fun perimeterOfRectangle() {
        val answerPerimeter = 2 * (length + width) 
        println("The perimeter of the rectangle is: " + answerPerimeter)
    }


}

fun main() {
    // Below is our object
    var myCircle = Circle()

    myCircle.circleArea()

    // Below is the object of the rectangle.
    var myRectangle  = Rectangle()

    myRectangle.areaOfRectangle()
    myRectangle.perimeterOfRectangle()

    println("The length of the rectangle is: " + myRectangle.length)

    println("The width of the rectangle is: " + myRectangle.width)
}