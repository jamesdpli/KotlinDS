package selectionsort

private fun findSmallestIndexInList(list: List<Int>): Int {

    // We start at index 0 and say it is the smallest
    var smallest = list[0]

    // We set the smallest index to be 0
    var smallestIndex = 0

    /**
     * Go through the list in a range of 0 to (list.size-1)
     *
     * A more kotlin way of writing it:
     * list.forEachIndexed { index, _ ->
     *     if (list[index] < smallest) {
     *         smallest = list[index]
     *         smallestIndex = index
     *     }
     * }
     */
    for (i in list.indices) {
        // If the list item is smaller than the smallest, update the smallest variable and smallest index variable
        if (list[i] < smallest) {
            smallest = list[i]
            smallestIndex = i
        }
    }

    return smallestIndex
}

/**
 * 1) Selection sort takes in an unsorted mutable array like an ArrayList
 * 2) We create an empty array in the function body
 * 3) We loop over each item in the array passed into the function
 * 4) We use a for loop to find the smallest index in the list passed in
 * 5) We add the smallest item in the list to our new empty list
 * 6) We do this for the entire list
 * 7) This is log n squared at worst
 */
private fun selectionSort(list: MutableList<Int>): List<Int> {

    // Initialise new list
    val sortedList = mutableListOf<Int>()

    // Loop over list passed in
    for (i in list.indices) {

        // Loop through list passed in to find the smallest value and its index
        val smallest = findSmallestIndexInList(list)

        // Add the value to the new list
        sortedList.add(list.removeAt(smallest))
    }

    println(sortedList)
    return sortedList
}

fun main() {
    println("---Selection sort on list (9, 7, 66, 8, 77, 8, 6, 4, 9090, 865, 55, 77, 4545)---")
    selectionSort(mutableListOf(9, 7, 66, 8, 77, 8, 6, 4, 9090, 865, 55, 77, 4545))
    println()
    println("---Selection sort on list (9, 450, 66, 8, 74, 8, 1, 4, 880000, 865, 55, 2, 1)---")
    selectionSort(mutableListOf(9, 450, 66, 8, 74, 8, 1, 4, 880000, 865, 55, 2, 1))
}