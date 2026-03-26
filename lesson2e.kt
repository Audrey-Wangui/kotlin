fun main() {
    // when Statement The when statement in Kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block.

    val marks = 7
    when(marks){
        in 1 .. 30 -> println("You failed")
        in 31 .. 50 -> println("You have average")
        in 51 .. 70 -> println("You above Average")
        in 70 .. 100 -> println("You passed")
        else -> println("Invalid scores...!")
    }



}