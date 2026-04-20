class Person{
    // Attributes/ characteristics/ properties of a person.
    var name = "James"
    var age = 45
    var height = 1.75
    var weight = 52

    // Behaviours/ actions/ doables
    fun walk(){
        println("The person can walk")
    }

    fun speak(){
        println("The person can speak...")
    }

    fun run(){
        println("The person can run.")
    }

    fun see(){
        println("The person can speak.")
    }


}

fun main(){
    // Objects in a real world thing
    // An object is itanciated/ created from class.
    //For us to be able to either access the properties/ behaviours of a class we require to have an object.

    // Below we create an object
    var myObject = Person()

    // Below we use the dot separator to access either the function or the properties.

    myObject.walk()

    println("The age of the person is: " + myObject.age)

    myObject.run()
    myObject.see()

    println("The height of the person is: " + myObject.height)

    println("The weight of the person is: " + myObject.weight)
}