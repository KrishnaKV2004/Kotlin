/*
    List in Collections -->

    In Kotlin, the List is a collection that holds elements in a specific order
    and allows duplicate values. A list is immutable by default, meaning that it
    cannot be modified after it is created. However, Kotlin also provides a mutable
    version of lists, called MutableList, which can be modified.

    1. Creation of Lists ->
    List in Kotlin is immutable, meaning you cannot modify its contents
    (no adding, removing, or updating elements).
    MutableList allows you to modify the list (add, remove, or update elements).

    2. Accessing Elements ->
    Lists maintain an index-based structure, so you can access elements using an index.

    3. Checking List Size ->
    You can check how many elements are in a list using the size property.

    4. Iteration ->
    You can loop through the list using standard loops (for, forEach, etc.).

    5. List Operations ->
    Immutable lists are read-only, but mutable lists allow operations such as adding or removing elements.
    Methods like get, set, add, remove, and more exist for list manipulation.

    6. Other List Methods ->
    contains: Checks if the list contains a specific element.
    first / last: Access the first and last elements.
    indexOf: Finds the index of a specific element.
    subList: Extracts a portion of the list.
    isEmpty / isNotEmpty: Check if the list is empty or not.
*/

fun main()
{
    // Creating an immutable list
    val immutableList: List<String> = listOf("Apple", "Banana", "Cherry")

    // Creating a mutable list
    val mutableList: MutableList<String> = mutableListOf("Apple", "Banana", "Cherry")

    // Accessing elements by index
    val firstElement = immutableList[0]  // Accessing the first element
    println("First element in immutable list: $firstElement")

    // Checking size of the list
    println("Size of the immutable list: ${immutableList.size}")

    // Iterating through the list
    println("Iterating over immutable list:")
    for (item in immutableList)
    {
        println(item)
    }

    // Using forEach loop (lambda)
    println("Using forEach on immutable list:")
    immutableList.forEach { item -> println(item) }

    // List contains a specific element
    val containsBanana = immutableList.contains("Banana")
    println("Immutable list contains Banana: $containsBanana")

    // Accessing first and last elements
    println("First element: ${immutableList.first()}")
    println("Last element: ${immutableList.last()}")

    // Find index of a specific element
    val indexOfCherry = immutableList.indexOf("Cherry")
    println("Index of Cherry: $indexOfCherry")

    // Extracting a sublist (range of elements)
    val sublist = immutableList.subList(0, 2)
    println("Sublist from index 0 to 2: $sublist")

    // Check if list is empty or not
    println("Is the immutable list empty? ${immutableList.isEmpty()}")

    // Mutable list operations
    println("\nMutable List Operations:")
    mutableList.add("Date")  // Adding an element
    println("Mutable list after adding 'Date': $mutableList")

    mutableList[1] = "Blueberry"  // Modifying an element at index 1
    println("Mutable list after updating index 1: $mutableList")

    mutableList.remove("Cherry")  // Removing an element
    println("Mutable list after removing 'Cherry': $mutableList")

    // Access size of mutable list
    println("Size of mutable list: ${mutableList.size}")

    // Check if mutable list is not empty
    println("Is the mutable list not empty? ${mutableList.isNotEmpty()}")
}

/*
    Key Methods Used -->

    listOf(): Creates an immutable list.
    mutableListOf(): Creates a mutable list.
    [index]: Accesses an element at a given index.
    size: Returns the number of elements in the list.
    for / forEach: Loops through the list.
    contains(): Checks if a particular element exists in the list.
    first() / last(): Gets the first and last elements.
    indexOf(): Finds the index of an element.
    subList(): Creates a sublist from the list.
    isEmpty() / isNotEmpty(): Checks if the list is empty or not.
    add(): Adds an element (for MutableList).
    set(): Updates an element (for MutableList).
    remove(): Removes an element (for MutableList).
*/