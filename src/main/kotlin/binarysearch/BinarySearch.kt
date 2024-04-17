package binarysearch

/**
 * 1) A binary search only works on a sorted array
 * 2) The algorithm works by finding the middle of an array, checking if that value is too high
 * or too low. If the value is too high we subtract one from the last index if it is too low we add one to
 * the lowest index
 * 3) This is log base 2 n in the worst case scenario
 * 4) A list with 128 entries will take at max 7 guesses, double the size to 256 it will take at max 8 guesses!
 */
object BinarySearch {

    fun binarySearch(list: List<Int>, item: Int): Int {

        // First index of the list
        var low = 0
        // Last index of the list
        var high = (list.size - 1)


        /**
         * 1) Whilst the first index is greater than or equal to the last index we know we are searching
         * 2) When they are equal there is one more case
         * 3) if low becomes greater than high, this means that our pointers have crossed and we have searched all
         * possible outcomes
         */
        while (low <= high) {

            // Represents the middle of the array
            val mid = (low + high) / 2

            // Guess the middle index of the array
            val guess = list[mid]

            // If the guess is equal to the item passed in, we return the index
            if (guess == item) {
                println(mid)
                return mid
            }

            /**
             * 1) If the guess is less than the item, we update the high pointer to mid - 1, we do this because we know
             * all values to the right of it are too high.
             * 2) Else we know the item was greater than the guess we update the low pointer to mid + 1, we do this
             * because all values to left are too low
             */
            if (guess < item) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        println(-1)
        return -1
    }

}

fun main() {
    println("---Binary search example inputting a list (1, 5, 8, 9, 10, 11, 14) and searching for 100---")
    BinarySearch.binarySearch(
        list = listOf(1, 5, 8, 9, 10, 11, 14),
        item = 5
    )
    println()
    println("---Binary search example inputting a list (20, 25, 58, 88, 99, 100) and searching for 88---")
    BinarySearch.binarySearch(
        list = listOf(20, 25, 58, 88, 99, 100),
        item = 88
    )
    println()
    println("---Binary search example inputting a list (100, 101, 199, 200, 222) and searching for 700---")
    BinarySearch.binarySearch(
        list = listOf(100, 101, 199, 200, 222),
        item = 88
    )
}