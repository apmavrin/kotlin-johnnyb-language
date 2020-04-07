
//class Car(val make: String, val model: String, var color: String) {
//
//    fun accelerate() {
//        println("Wroom! Wroom!")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model has trowing capacity $towingCapacity")
//    }
//}

//classes to be able to be inherited must be opened
open class Vehicle(val make: String, val model: String) {
    open fun accelerate() { //method must be open for overriding 
        println("Wroom! Wroom!")
    }
    fun park() {
        println("Parking the vehicle")
    }
    fun brake() {
        println("Stop!")
    }
}

class Car(make: String, model: String, var color: String): Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("Heading to the mountains")
    }
}
fun main() {

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()

//    val car = Car("Toyota", "Camry", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    truck.details()

}