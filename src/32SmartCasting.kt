/*
    Type Checking and Smart Casting -->

    In Kotlin, type checking and smart casting are essential features that help manage
    types more safely and concisely. Type checking is used to determine whether an object
    is of a specific type, while smart casting allows the compiler to automatically
    cast an object to a type after it has been checked.
    You can check the type of object using the 'is' keyword !

    When you use 'is' for type checking, Kotlin automatically casts the variable to the
    specified type within the corresponding block. This means you don't need to cast it manually
    In Kotlin, the 'as' keyword is used for explicit type casting. It allows you to convert an
    object from one type to another, but you should use it carefully, as it can throw a
    ClassCastException if the object is not of the expected type.

    Safe Casting with 'as' ? -->

    To avoid exceptions during casting, you can use the safe cast operator as?.
    This operator attempts to cast the object and returns null if the cast fails, preventing a crash.
*/

fun process(value: Any)
{
    if (value is String)
    {
        // Smart cast
        println("String length -> ${value.length}")
    }
    else if (value is Int)
    {
        // Explicit cast
        val intValue = value as Int
        println("Integer multiplied by 2 -> ${intValue * 2}")
    }
}

fun main()
{
    process("Hello") // Outputs: String length -> 5
    process(10)      // Outputs: Integer multiplied by 2 -> 20
    process(3.14)    // No output, as it's an unknown type
}