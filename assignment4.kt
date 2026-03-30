fun main(){
    // 1. Create a For loop to print year from 2000 to 2025

    for (year in 2000 .. 2025){
        println(year)
    }

    println("=========")

    // 2. Create a For loop to print from 100 to 1
    for (num in 100 downTo 1){
        println(num)
    }

    println("========")

    // 3. Create a while loop to print from -20 to +20
    var num1 = 20
    while (num1 >= -20){
        println(num1)
        num1 = num1 - 1
    }

    print("=========")

    // 4. Create a while loop to print all EVEN years from 2000 to 2025.
    var num2 = 2000
    while (num2 <= 2025){
        if (num2 % 2 == 0){
            println(num2)
        }
    num2 = num2 + 1   
    }

    print("=========")

    // 5. use of for loop create an array of 7 counties and loop through them.

    val counties = arrayOf("Nairobi", "Kisumu", "Mombasa", "Nakuru", "Kiambu", "Machakos", "Nyeri")

    for (county in counties){
        println(county)
    }

    print("=======")

    // Research on functions without parameters in kotlin
    // This a functions that ddo not need variable names attached to them.

    // This is called unit since it doesn't have any meaningful value 
    fun greet() {
        println("Hello world!")
    }
    greet()

    // Single-line  function
   
    fun num3() = println(30)
    num3()

    // Difference between local and global variables.
    (like the weather)
    
    // Local variables => It only exists inside the specific function where it was created. Even if two functions use the same variable name, they're storing their data in completely different memory locations.


}