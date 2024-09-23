/*
    Collections In Kotlin -->

    Kotlin provides an extensive collection library that consists of
    data structures for handling groups of objects. Collections in Kotlin
    are divided into two broad categories: Immutable and Mutable collections.

    Immutable Collections -->

    These are read-only collections, meaning you cannot modify their contents after initialization.
    Operations like adding or removing elements are not supported.

    Commonly used immutable collections include ->

    List: Ordered collection of elements (allows duplicates).
    Set: Unordered collection that does not allow duplicates.
    Map: Collection of key-value pairs, where keys are unique.

    Mutable Collections -->

    These collections can be modified (i.e., add, remove, update elements).
    Mutable collections are useful when you need to perform frequent changes to the data.

    Common mutable collections include ->

    MutableList: Like List, but elements can be modified.
    MutableSet: Like Set, but elements can be added or removed.
    MutableMap: Like Map, but key-value pairs can be added or updated
*/

fun main()
{
    //  Immutable -->

    val immutableList = listOf(1, 2, 3)
    val immutableSet = setOf("apple", "banana", "cherry")
    val immutableMap = mapOf("key1" to "value1", "key2" to "value2")

    //  Mutable -->

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)

    val mutableSet = mutableSetOf("apple", "banana")
    mutableSet.add("cherry")

    val mutableMap = mutableMapOf("key1" to "value1")
    mutableMap["key2"] = "value2"
}

/*
     Common Collection Functions -->

    isEmpty() / isNotEmpty(): Checks if a collection is empty.
    size: Returns the number of elements in the collection.
    contains(): Checks if a collection contains an element.
    forEach(): Iterates through each element.

    Summary -->

    Immutable collections are read-only; Mutable collections allow modifications.
    Kotlin supports common data structures like List, Set, and Map.
    Provides functional operations (filter, map, reduce, etc.) for convenient data manipulation.
    Sequences enable lazy evaluation for performance optimizations.
*/