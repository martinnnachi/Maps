package academy.learnprogramming.maps

fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("Blue", "BMW", 2011),
            2 to Car("Grey", "Mercedes", 2014),
            3 to Car("Black", "Range Rover", 2018))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = mutableMapOf("Martin's car" to Car("Ash Grey", "Range Rover", 2018),
            "Ann's car" to Car("White", "Mercedes", 2017))

    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Malika's car", Car("Pink", "BMW", 2017))

    for ((key, value) in mutableMap) {  //destructuring declarations
        println(key)
        println(value)
    }

    val pair = Pair(10, "Ten")

//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair //destructuring declarations
    println(firstValue)
    println(secondValue)

    val car = Car("Red", "Ford", 2000)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")


}


class Car(val color: String, val model: String, val year: Int) {

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year


}