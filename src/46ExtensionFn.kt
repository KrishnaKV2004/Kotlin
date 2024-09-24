/*
    Extension Functions -->

    Extension functions allow you to add new functionality to existing classes
    without modifying their source code or inheriting from them. This makes your
    code more readable and maintainable. You can define a function for a class as
    if it was a member function of that class.

    Key Points:
    Extension functions do not actually modify the class but provide a way to extend its functionality.
    You can define extensions for any class, even if you don’t have access to its source code.

    Syntax -->

    fun ClassName.functionName()
    {
        // Function body
    }
*/

fun String.reverseWords(): String
{
    return this.split(" ").reversed().joinToString(" ")
}

fun main()
{
    val sentence = "Kotlin is awesome"
    println(sentence.reverseWords())  // Output: "awesome is Kotlin"
}