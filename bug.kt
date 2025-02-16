fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code snippet uses `removeIf` to remove even numbers from a list, however, it modifies the list while iterating over it. This can lead to unexpected behavior because the indices of the elements will change during the process of removal. For example, if you try to remove items by their index then removing items might cause the index you are looking for to be moved.