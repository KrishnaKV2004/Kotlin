/*
    Maps In Kotlin -->

    In Kotlin, a Map is a collection of key-value pairs where each key is unique.
    It provides an efficient way to look up values based on their keys. Like other
    collections in Kotlin, Map comes in two types: immutable (Map) and mutable (MutableMap).

    Key Features of Maps in Kotlin -->

    Immutable Map (Map): Cannot be modified after it is created. You can only read values.
    Mutable Map (MutableMap): Allows you to add, remove, and modify key-value pairs.
    Unique Keys: Each key in the map must be unique, but values can be duplicated.
    Key-Value Pairs: Maps store data in pairs, where each key is mapped to a value.

    Common Operations in Maps -->

    Accessing values by key: You can use a key to get its associated value.
    Adding and removing key-value pairs: Only available in mutable maps.
    Iteration: You can loop through a map to access its keys, values, or key-value pairs.
    Checking if a key or value exists: You can check if a map contains a specific key or value.
    Retrieving all keys or values: You can get all the keys or values as collections.
*/

fun main()
{
    // Creating an immutable map
    val immutableMap: Map<String, Int> = mapOf("Apple" to 1, "Banana" to 2, "Cherry" to 3)

    // Creating a mutable map
    val mutableMap: MutableMap<String, Int> = mutableMapOf("Apple" to 1, "Banana" to 2, "Cherry" to 3)

    // Accessing values by key
    println("Value for key 'Apple': ${immutableMap["Apple"]}")

    // Getting size of the map
    println("Size of immutable map: ${immutableMap.size}")

    // Iterating through the map
    println("Iterating over immutable map:")
    for ((key, value) in immutableMap)
    {
        println("$key -> $value")
    }

    // Check if map contains a specific key or value
    println("Does immutable map contain key 'Banana'? ${immutableMap.containsKey("Banana")}")
    println("Does immutable map contain value 3? ${immutableMap.containsValue(3)}")

    // Retrieving all keys or values
    println("Keys: ${immutableMap.keys}")
    println("Values: ${immutableMap.values}")

    // Mutable map operations
    println("\nMutable Map Operations:")
    mutableMap["Date"] = 4  // Adding a new key-value pair
    println("Mutable map after adding 'Date': $mutableMap")

    mutableMap["Banana"] = 5  // Modifying an existing value
    println("Mutable map after updating 'Banana': $mutableMap")

    mutableMap.remove("Apple")  // Removing a key-value pair
    println("Mutable map after removing 'Apple': $mutableMap")

    // Clear the mutable map
    mutableMap.clear()
    println("Mutable map after clearing: $mutableMap")
}

/*
    Key Methods Demonstrated -->

    mapOf(): Creates an immutable map.
    mutableMapOf(): Creates a mutable map.
    ["key"]: Accesses the value associated with a key.
    size: Returns the number of key-value pairs in the map.
    containsKey(): Checks if the map contains a specific key.
    containsValue(): Checks if the map contains a specific value.
    keys: Returns all keys in the map.
    values: Returns all values in the map.
    put() / remove() / clear(): Mutable map operations to modify the map.
*/