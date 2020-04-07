fun main() {
    //immutable
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))

    //mutable
    val rebels = arrayListOf("Leia", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Chewbacca"))

    rebels.remove("Han Solo")
    println(rebels)

    //Maps -> dictionaries in Swift
    //immutable

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leia", "This ship doesn't exist")) //prevent crash
    println(rebelVehiclesMap.values)

    //mutable collection

    val rebelVehicles = hashMapOf("Solo" to "Millenium Malcon", "Luke" to "Lamdspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "X-Wing"
    rebelVehicles.put("Leia", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
    rebelVehicles.clear()
}







