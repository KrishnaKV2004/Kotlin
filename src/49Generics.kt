/*
    Generics -->

    Generics in Kotlin allow you to create classes, interfaces, and functions
    that work with any data type while maintaining type safety.
    They make code more flexible and reusable by enabling the same code to operate on various types.


*/

//  Generic Class -->
//  A generic class can accept a type parameter, allowing it to
//  store and operate on objects of any type.

class Box<T>(var content: T)
{
    fun getCont(): T
    {
        return content
    }

    fun setCont(newContent: T)
    {
        content = newContent
    }
}

//  Generic Function -->
//  You can also create generic functions that can accept arguments of any type.

fun <T> printCont(content: T)
{
    println("Content: $content")
}

fun main()
{
    //  Generic Class -->

    // Box for Integers
    val intBox = Box(10)
    println("Integer Box: ${intBox.getCont()}")  // Output: Integer Box: 10

    // Box for Strings
    val stringBox = Box("Hello")
    println("String Box: ${stringBox.getCont()}")  // Output: String Box: Hello

    // Change the content of the boxes
    intBox.setCont(20)
    stringBox.setCont("World")

    println()
    println("Updated Integer Box: ${intBox.getCont()}")      // Output: Updated Integer Box: 20
    println("Updated String Box: ${stringBox.getCont()}")    // Output: Updated String Box: World
    println()

    //  Generic Function -->

    printCont(123)        // Output: Content: 123
    printCont("Kotlin")   // Output: Content: Kotlin
    printCont(3.14)       // Output: Content: 3.14
}
