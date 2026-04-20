// Inheritance is whereby a child class obtains the properties and behaviours of another class (Parent Class).

open class Animal {
    // Properties
    var name = "Name"

    // Behaviours of the animal
    fun walk() {
        println("The animal can walk")
    }

    fun sleep() {
        println("The animal can sleep")
    }
}

// Below class inherits from the super/  parent class animal
class Dog : Animal() {
    fun bark(){
        println("The dog likes barking...")
    }
}

fun main() {
    // Create an object 
    var myDog =  Dog()

    // accessing the behaviors of a dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}

