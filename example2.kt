// Method/ function override: It compeletly replaces the rice function with pilau.
open class Food {
    open fun Rice() {
        println("Rice is white.")
    }
}

class Pilau : Food(){
    override fun Rice() {
        println("Pilau is coloured rice.")
    }
}

// Property override.


fun main() {
    val o = Pilau()
    o.Rice()
}