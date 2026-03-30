fun main(){
    // Below is a function that is able to add two numbers

    fun addition(){
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2
        println("The sum of the numbers is: $sum")
    }
    addition()

    println("============")

    // Create a function that is able to multiple three numbers

    fun product(){
        val num1 = 10
        val num2 =  20
        val num3 = 30
        val answer = num1 * num2 * num3
        println("The product of three numbers is: $answer")
    }

    product()

    // println("=============")

    // Give two numbers create a function that is able to find the largest and the smallest of the nmbers

    fun maxNumber(){
    val num3 = 40
    val num4 = 100

    if (num3 > num4){
        println("The largest is: $num3")
    }
    else{
        (num4 > num3)
        println("The largest is: $num4")
    }
    }
    maxNumber()

    // Given 179 minutes, create a function that is able to convert the said minutes into hours and to show the remainder of the minutes

    fun conversion(){
        val minutes = 179
        val conv = minutes / 60
        val remainder = minutes % 60
        println("$conv hours and $remainder minutes")

    }
    conversion()
}
