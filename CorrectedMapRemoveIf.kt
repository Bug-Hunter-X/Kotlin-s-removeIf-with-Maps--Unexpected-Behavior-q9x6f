fun main() {
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)

    // Solution 1: Using an iterator
    val iterator = map.entries.iterator()
    while (iterator.hasNext()) {
        if (iterator.next().value > 2) {
            iterator.remove()
        }
    }
    println(map) // Output: {a=1, b=2}

    // Solution 2: Create a copy of the entries
    val entriesToRemove = map.entries.filter { it.value > 2 }.toList()
    entriesToRemove.forEach { map.remove(it.key) }
    println(map) // Output: {a=1, b=2}
} 