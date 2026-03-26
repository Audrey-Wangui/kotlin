fun main(){
// Using if statements or when statement, create a program to find if given year is leap or not
val  year = 1700
when {
    (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)  -> println("This is a  leap year.")
    else -> println("This is not a leap  year.")
}

// Using if statements check if a given number is ODD or Even
val number = 33
if (number % 2 == 0){
    println("Even")
}
else{
    println("Odd")
}
}
