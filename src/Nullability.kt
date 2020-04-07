fun main() {
    var name : String = "Anton M"
//    name = null

    var nullableName :String? = "Do I really exist?"
    println(nullableName)
    // nullableName = null

    // Null Check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    //same Null check, but recommended syntax
    val l = if (nullableName != null) nullableName.length else -1

    //Safe Call Operator

    println(nullableName?.length)

    //Elvis Operator

    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me"
    println(noName)

    // !! force unwrapping

    println(nullableName!!.length)


}