import java.util.*

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun feedTheFish() {
    val day = "Tuesday"
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String{
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}


fun main(args: Array<String>) {
    //dayOfWeek()
    feedTheFish()
}