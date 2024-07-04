package lists.linklist

/**
 * Do not use this, this is a very simple example for my personal use when thinking about a linked list
 */
fun main() {
    println(SimpleLinkedList().nodeOne.next)
    println(SimpleLinkedList().nodeTwo.next)
    println(SimpleLinkedList().nodeThree.next)
    println(SimpleLinkedList().nodeFour.next)
}

class SimpleLinkedList {
    val nodeFour = Node(data = 222)
    val nodeThree = Node(data = 11, nodeFour)
    val nodeTwo = Node(data = 4, nodeThree)
    val nodeOne = Node(data = 5, next = nodeTwo)
}

data class Node(
    val data: Int,
    val next: Node? = null
)