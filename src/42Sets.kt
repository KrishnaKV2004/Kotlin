/*
    Overview of Sets in Kotlin -->

    Immutable Set (Set) -->
    A collection that cannot be modified after creation.
    Use setOf() to create an immutable set.
    It automatically ensures that all elements are unique.

    Mutable Set (MutableSet) -->
    A collection that can be modified (you can add, remove, or update elements).
    Use mutableSetOf() to create a mutable set.

    Characteristics -->

    Unique Elements: No duplicate values are allowed.
    Unordered: The elements do not maintain any specific order.
    Common Operations:
    add(): Adds an element to the set.
    remove(): Removes an element from the set.
    contains(): Checks if an element is present in the set.
    size: Returns the number of elements in the set.
    isEmpty(): Checks if the set is empty.
*/

fun main()
{
    // Creating an immutable set
    val immutableSet: Set<String> = setOf("Apple", "Banana", "Cherry")

    // Creating a mutable set
    val mutableSet: MutableSet<String> = mutableSetOf("Apple", "Banana", "Cherry")

    // Accessing size of the set
    println("Size of immutable set: ${immutableSet.size}")

    // Checking if a set contains an element
    val containsBanana = immutableSet.contains("Banana")
    println("Immutable set contains Banana: $containsBanana")

    // Iterating through the set
    println("Iterating over immutable set:")
    for (item in immutableSet)
    {
        println(item)
    }

    // Mutable set operations
    println("\nMutable Set Operations:")
    mutableSet.add("Date")  // Adding an element
    println("Mutable set after adding 'Date': $mutableSet")

    mutableSet.remove("Banana")  // Removing an element
    println("Mutable set after removing 'Banana': $mutableSet")

    // Check if mutable set is empty or not
    println("Is the mutable set empty? ${mutableSet.isEmpty()}")

    // Clear all elements from the mutable set
    mutableSet.clear()
    println("Mutable set after clearing: $mutableSet")
}

/*
    Key Methods Demonstrated -->

    setOf() / mutableSetOf(): Create immutable and mutable sets.
    size: Get the number of elements.
    contains(): Check for an element's presence.
    add() / remove(): Modify the mutable set.
    isEmpty(): Check if the set is empty.
    clear(): Remove all elements from the mutable set.
*/