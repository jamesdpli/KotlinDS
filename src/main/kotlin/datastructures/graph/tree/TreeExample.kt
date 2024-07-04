package datastructures.graph.tree

private val phoneBook = hashMapOf(
    Pair("James", "0765435167"),
    Pair("Jill", "07876534561"),
    Pair("John", "08975432673"),
    Pair("Pipper", "08716534256"),
    Pair("Jules", "08765436761"),
)

fun main() {
    println(" --- Phone book keys --- ")
    println(phoneBook.keys)
    println(" --- Phone book values --- ")
    println(phoneBook.values)
    println(" --- Phone book value for key 'James' --- ")
    println(phoneBook["James"])
}




