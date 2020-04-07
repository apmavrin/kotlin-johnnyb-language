fun main() {

    //Lambda expression
    val printMessage = {message: String -> println(message)}
    printMessage("Hello World!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    //different way of writing the example above
    val sumB : (Int, Int) -> Int = {x,y -> x+y}

    //dummy download request function

    fun downloadData(url: String, completion: ()->Unit) {
        // sent download request
        // we got back data
        //there were no network errors
        completion()
    }

    //cal the downloadData function
    downloadData("Fake Url") {
        println("the code in this block will only run after the  completion()")
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        println(car.color)
        println(car.make)
    }
//when only one parameter is passed into the lambda, it could be removed and referenced by "it"
    downloadCarData("fakeUrl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //make the web request
        //get the results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            //received truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeURL.com") {truck, success ->
        if (success) {
            //do something with truck
            truck?.tow()
        } else {
            //handle te web request failure
            println("Something went wrong")
        }
    }
}