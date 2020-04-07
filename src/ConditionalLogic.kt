fun main() {

    val a = 2
    val b = 3

    if (a == b)  {
        println("A does equal B")
    }

    if (a != b) {
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("You can buy this")
    } else {
        println("Sorry, you broke")
    }

    val degrees = 30
    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap. It's cold")
    }

    val isHungry = false
    val isBored = true

    if (!isHungry || isBored ) {
        println("Let's get pizza")
    }
    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }

    fun vaderisFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("Run for the hills. Vader is $mood")
        } else {
            println("Whatever you do, don't make Vader angry")
        }
    }

    vaderisFeeling("happy")
}





