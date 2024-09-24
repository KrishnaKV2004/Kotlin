/*
    Nested and Inner Classes in Kotlin -->

    In Kotlin, you can define classes inside other classes.
    These are called nested or inner classes.
    The key difference between them is their access to the outer
    class's properties and functions.

    1. Nested Class ->

    A nested class is a class defined inside another class.
    By default, a nested class does not have access to the outer class's
    properties or functions unless it is marked as inner.
    It behaves like a static class in Java.

    2. Inner Class ->

    An inner class is a class that is defined inside another class and is
    marked with the inner keyword.
    An inner class has access to the properties and functions of its outer class.
    You can refer to the outer class's instance using the keyword this@OuterClass.
*/

class OuterClass
{

    val outerProperty: String = "I am from the Outer Class"

    // Nested class (doesn't have access to outer class properties)
    class NestedClass
    {
        fun nestedMethod(): String
        {
            return "I am from the Nested Class"
        }
    }

    // Inner class (has access to outer class properties)
    inner class InnerClass
    {
        fun innerMethod(): String
        {
            return "I am from the Inner Class, accessing outer property: $outerProperty"
        }
    }
}

fun main()
{
    // Using the Nested Class
    val nestedObject = OuterClass.NestedClass()
    println(nestedObject.nestedMethod())

    // Using the Inner Class
    val outerObject = OuterClass()
    val innerObject = outerObject.InnerClass()
    println(innerObject.innerMethod())
}

/*
    Explanation -->

    Nested Class:
    Defined inside OuterClass but does not have access to outerProperty.
    It can be instantiated without creating an instance of the
    outer class: OuterClass.NestedClass().

    Inner Class:
    Marked with the inner keyword and has access to outerProperty.
    It can only be instantiated using an instance of the
    outer class: outerObject.InnerClass().
    Inside the innerMethod, we access the outer class's property
    using outerProperty.
*/