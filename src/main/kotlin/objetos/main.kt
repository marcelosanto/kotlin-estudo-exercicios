package objetos

fun main() {
    val myCar = Car("Blue", "BMW")
    myCar.drive()
    myCar.speed(100, 200)

    println("Car color: ${myCar.color} - model: ${myCar.model}")
}

class Car(var color: String, var model: String) {

    init {
        if (color == "Pink") println("Yeeaah Boys")
        else println("$color is not Pink")


    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and Max speed is $maxSpeed")
    }

    fun drive() {
        println("Drive... VROOOMMMMM")
    }
}
