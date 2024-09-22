/*
    Companion Object -->
    In Kotlin, you can use an object declaration inside a class by using a companion object.
    It allows you to define members that are tied to the class itself (like static members in Java).
*/

class MyClass
{
    companion object    //  With companion object
    {
        fun create() {println("I am a Companion Object !")}
    }

    object MyObject     //  Without companion object
    {
        fun create() {println("I am an Object")}
    }

    //  Only one companion object is allowed per class !
}

fun main()
{
    MyClass.create()            // Accessing the companion object method
    MyClass.MyObject.create()   //  Accessing the normal object method
}