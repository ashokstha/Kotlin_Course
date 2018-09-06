package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {

    val myAquarium = Aquarium()
    myAquarium.volumn = 100
    println("Length: ${myAquarium.length}\n" +
            "Width: ${myAquarium.width}\n" +
            "Height: ${myAquarium.height}\n" +
            "Volumn: ${myAquarium.volumn}\n")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium2" +
            "Length: ${smallAquarium.length}\n" +
            "Width: ${smallAquarium.width}\n" +
            "Height: ${smallAquarium.height}\n" +
            "Volumn: ${smallAquarium.volumn}\n")

    val smallAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium2" +
            "Length: ${smallAquarium2.length}\n" +
            "Width: ${smallAquarium2.width}\n" +
            "Height: ${smallAquarium2.height}\n" +
            "Volumn: ${smallAquarium2.volumn}\n")

    /*val mySpice = SimpleSpice()
    println("Name: ${mySpice.name}, Heat: ${mySpice.heat}")*/

    /*val spices1 = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter {it.heat < 5}*/




}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark :${shark.color}, Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}
