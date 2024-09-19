/*
    Overriding -->
    Overriding in object-oriented programming (OOP) occurs when a subclass provides
    a specific implementation for a method that is already defined in its superclass

    Example -->
    Suppose there is a parent class Mobile and a child class Samsung
    Now Samsung will implement properties and methods from Mobile,
    but it has different properties and methods. So we have to override these
    properties and methods according to our child class
*/

open class Mobile()
{
    //  We will use open with properties and methods which we want to override !

    open val name: String = "Mobile"
    open val size:Double = 6.7

    fun makeCall() {println("Calling !")}
    fun powerOff() {println("Shutting Down !")}
    open fun displayInfo() {println("Normal Display")}
}

class Samsung(name:String, size:Double): Mobile()
{
    override val name: String = name
    override val size: Double = size

    override fun displayInfo() {println("2x Dynamic Super Amoled Display")}
}

fun main()
{
    val mobile = Mobile()
    val s24 = Samsung("S24", 6.2)

    //  Let's try to access Mobile's properties and methods -->

    println("Mobile -->\n")
    println(mobile.name)
    println(mobile.size)
    mobile.makeCall()
    mobile.displayInfo()

    //  Let's try to access Samsung's properties and methods -->
    println()
    println("Samsung -->\n")
    println(s24.name)
    println(s24.size)
    s24.powerOff()
    s24.displayInfo()

    /*
        Super keyword -->
        Now suppose if I want that first displayInfo of parent's class get executed
        by the child class object, I will use super to call parent class Constructor

        Syntax -->
        In class Samsung ...
        fun displayInfo()
        {
            super.displayInfo()
            println("2x Dynamic Super Amoled Display")
        }
        //  This will print -->
            -> Normal Display (Parent class method)
            -> 2x Dynamic Super Amoled Display (Child class method)
    */
    //  ~ You can also override setter and getter methods like this !
}

/*
    Any -->
    In Kotlin, Any is the root of the class hierarchy,
    much like Object in Java. Every class in Kotlin implicitly
    inherits from Any if no other superclass is specified.

    Key Points -->

    -> Default Superclass: Every class in Kotlin extends Any, either directly or indirectly, unless you explicitly specify a different superclass.
    -> Basic Methods: The Any class provides three fundamental methods:
       toString(): Returns a string representation of the object.
       equals(other: Any?): Boolean: Checks if this object is equal to another object.
       hashCode(): Returns a hash code for the object.
    -> Nullable: You can use Any? to represent a type that can hold any object or null.
*/