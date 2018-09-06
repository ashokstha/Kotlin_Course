package Spices

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    var heat: Int
        get() = when {
            spiciness == "mild" -> 5
            else -> 1
        }
        set(value) {}

}