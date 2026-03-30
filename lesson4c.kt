fun main(){
    // Functions with parameters
    // Parameters are inputs that get passed as arguments when invoking a function.
    // Note:  For parameters you must specify their data types.

    fun greeting (name : String) {
        println("Hello $name, Hope you had a good day :)")
    }

    // When the function is invoked, you pass a given name as an argument
    greeting("Audrey")
    greeting("Wangui")

    println("================")

    // Below is an example of a function that is  able to  calculate the BMI of a ppperson
    fun BMI (weight : Double, height : Double) {
        val answer = weight / (height * height)
        println("The BMI is: $answer")
    }

    BMI(69.5, 1.73)
    BMI(58.6, 1.87)

    println("================")

    // Create  a function that accepts parameters and checks whether a given number is odd or even

    fun check (number : Int) {
        if(number % 2 == 0){
            println("The number is even")
        }
        else{
            (number % 2 != 0)
            println("The  number is odd")
        }
    }

    check(30)

    
    

   
}