//  Arrays In Kotlin -->

fun main()
{
    // 1. Creating an Array of integers
    val intArray = arrayOf(1, 2, 3, 4, 5)

    // 2. Accessing elements of an Array
    // Arrays are zero-indexed, meaning the first element is at index 0
    println("The first element is: " + intArray[0]) // Output: 1
    println("The second element is: " + intArray[1]) // Output: 2

    // 3. Modifying elements of an Array
    // You can modify the value of an array element by specifying the index
    intArray[0] = 10 // Modifying the first element
    println("The updated first element is: " + intArray[0]) // Output: 10

    // 4. Creating an Array of Strings
    val stringArray = arrayOf("Apple", "Banana", "Cherry")

    // Accessing and displaying elements
    println("First fruit: " + stringArray[0]) // Output: Apple
    println("Second fruit: " + stringArray[1]) // Output: Banana

    // Modifying elements in the String array
    stringArray[1] = "Blueberry"
    println("Updated second fruit: " + stringArray[1]) // Output: Blueberry

    // 5. Array of mixed data types
    // Kotlin allows arrays of mixed types, but they are stored as `Any`.
    val mixedArray = arrayOf(1, "Two", 3.0)

    println("First element (Int): " + mixedArray[0]) // Output: 1
    println("Second element (String): " + mixedArray[1]) // Output: Two
    println("Third element (Double): " + mixedArray[2]) // Output: 3.0

    //  To specify type of Array use
    val con = arrayOf<String>("India", "Japan", "Korea")

    //  If you try to print whole array it will return array object's memory reference
    println(con)
    //  To get contents in array
    println(con.contentToString())
}