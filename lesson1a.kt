fun main(){
    // A variable is a container that stores data.
    // Variable Naming Rules: • Start with a letter or an underscore: The variable name must start with a letter (az or A-Z) or an underscore (_). • Use letters, numbers, or underscores: After the first character, you can use letters, numbers (0-9), or underscores. • Cannot use Kotlin keywords: Reserved keywords like fun, val, var, etc., cannot be used as variable names. Check reserved keywords in Appendix A • Naming conventions: By convention, variables are typically named using camelCase (starting with a lowercase letter and capitalizing subsequent words), e.g., userAge, productPrice, product_price

    // In kotlin we have 2 types of initializers e.i var and val
    // Val => immutable(unchangable)
    // Var => mutable(changable)

    val name = "Audrey" // string -> a series of characters inside quotes
    val number1 = 5 // Integer -> whole number
    val number2 = 40.6 // Double ->  Number with a decimal
    var letter = "k" // Char -> It is a single letter of the alphabet
    var isRegistered = true // boolean -. It evaluates to either true or false

    println(name)
    println(number1)
    println(number2)
    println(letter)
    println(isRegistered)

    
}