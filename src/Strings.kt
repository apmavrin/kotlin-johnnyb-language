fun main() {
    val str = "May the force be with you." // \r \t \b \$
    println(str)

    val str1 = "My dad said the funniest thing. He said \" A joke\" " // string with escaped characters

    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...""".trimMargin()
    println(rawCrawl + "\n")

    val rawCrawl2 = """>A long time ago,
        >in a galaxy
        >far, far, away...""".trimMargin(marginPrefix = ">")
    println(rawCrawl)
/*
    for (char in str) {
        println(char)
    }
 */
    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("force", true)
    println("Contains the word \"force\" or not:" + contains) //old way


    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSabreColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSabreColor lightsaber and drives a $vehicle and he is $age years old.")
    println("Luke's full name is $luke has ${luke.length} characters")

}