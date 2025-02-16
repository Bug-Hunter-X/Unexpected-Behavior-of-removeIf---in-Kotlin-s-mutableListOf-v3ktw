fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    list.forEach { 
        if (it % 2 == 0) {
            evenNumbers.add(it)
        }
    }
    list.removeAll(evenNumbers)
    println(list)
}

This solution creates a separate list to store even numbers and then removes these even numbers in one go. This approach avoids modifying the list during iteration, thus preventing unexpected behavior.