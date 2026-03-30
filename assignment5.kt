import kotlin.math.pow 
fun main() {
// create a function that accepts parameter that is able to do the conversion of degree celcius into fahrenheit.

fun conversion(degrees : Int) {
    val fah = (degrees * 9/5) + 32
    println("$degrees is $fah fahrenheit")
}

conversion(360)

println("===========")
sayHello()



// Create a function that is able to calculate the compound interest of a person.
fun compound_interest(principle : Int, rate : Double, time : Int) {
    val interest = principle * (1 + rate).pow(time)
    val answer = interest - principle

    println("The compound interest is: $answer")
}

compound_interest(25000, 0.05, 2)

println("===========")

val say = Salute()
say.hello()
say.hi()






}

 // Research on inheritance in kotlin. Come up with an example of a program.
 //  This is when one class defines certain features (parent) and the other class extends and reuses these features.

 //  Parent class
 open class Greet {
    fun hello(){
        println("Hello there :)")
    }
 }

 //  Child class
 class Salute : Greet() {
    fun hi(){
        println("How are you?")
    }
 }

 
// Global variable.
// Global  variables => It can be accessed and modified anywhere inside the program.
// Its declaired outside all  functions and classes in your program then used anywhere.

fun sayHello() {
    println("Hello world!!")
}

// Local variables => It only exists inside the specific function where it was created. Even if two functions use the same variable name, they're storing their data in completely different memory locations.


