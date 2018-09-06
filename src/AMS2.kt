import java.util.*


fun main(args: Array<String>) {
    /*println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))*/

    val rollDice = { Random().nextInt(12) + 1}
    println(rollDice)
}

fun whatShouldIDoToday(
        mood: String,
        weather: String = "sunny",
        temperature: Int = 24
): String {

    return when {
        phase1(mood, weather) -> "go for a walk"
        phase2(mood, weather, temperature) -> "stay in bed"
        phase3(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun phase1(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

fun phase2(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun phase3(temperature: Int) = temperature > 35