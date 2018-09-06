package Aquarium

class Fish(val friendly: Boolean = true, val volumnNeeded: Int) {
    val size: Int

    init {
        println("First Initialization")
    }

    constructor(): this(true, 9){
        println("Running secondary constructor...")
    }

    init {
        if (friendly) {
            size = volumnNeeded
        } else {
            size = volumnNeeded * 2
        }
    }
}

fun fishExample(){
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volumn ${fish.size}")
}