fun main(){
    // For loop
    // It is used to execute a block of code/statement a number of times until a condition is met

    for(number in 1 .. 10){
        println("The count is: $number" )
    }

    println("========")

    // Create a for loop that is able to  print from 50 to 65

    for(number in 50 .. 65){
        println("The count is: $number")
    }

    println("=========")

    //Research on how to increment on the for loop by use of steps

    for (a in 0 .. 20 step 2){
        println(a)
    }

    println("=======")
    // Below we find the odd number in the given range

    for(x in 20 .. 40){
        if(x % 2 != 0){
            println(x)
        }

        }

    println("======")

    // By use of a for loop, generate the multiplication table from 1 to 5
    for(b in 1 .. 5){
        val product = 5 * b
        println("5 * $b = $product")
    }

    println("=========")
    // Create a program that is able to find the factorial of number 5

    var fact = 1

    for (i in 1 .. 5){
        fact = fact * i
    }
    println("Factorial of 5 is $fact")

}
