package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorattions("granite")
    println(d1)

    val d2 = Decorattions("slate")
    println(d1)

    val d3 = Decorattions("slate")
    println(d1)
}

data class Decorattions(val rocks: String){}