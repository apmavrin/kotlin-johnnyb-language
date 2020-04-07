fun main() {

    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return  goodGuys
    }

    println("Darth Vader faced off against ${calculateNumberGoodGuys(12, 5)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")
}