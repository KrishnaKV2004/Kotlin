/*
    Objects In Kotlin -->

    In Kotlin, an object declaration is used to create a singleton.
    A singleton is a design pattern where a class has only one instance throughout
    the application. Kotlin makes it easy to create singletons with the object keyword.

    When you declare an object in Kotlin using the object keyword, it ->

    Is initialized lazily when first accessed.
    Has only one instance.
    Can have properties, methods, and initializers like a regular class.
    Can implement interfaces or extend classes.

    Syntax -->

    object ObjectName
    {
        // Properties
        val name = "Singleton"

        // Methods
        fun greet() = "Hello from Singleton!"
    }
*/

//  Object declaration with properties and methods

object DatabaseConnection
{
    private const val URL = "jdbc:mysql://localhost:3306/mydb"

    fun connect() {println("Connecting to $URL")}
}

fun main()
{
    // Accessing the singleton object
    DatabaseConnection.connect()  // Outputs: Connecting to jdbc:mysql://localhost:3306/mydb
}

/*
    Characteristics of Object Declaration -->

    Singleton: Only one instance of the object is created.
    No constructor: You cannot create a constructor for an object, nor can you instantiate it directly.
    Lazy Initialization: The object is initialized only when it is accessed for the first time.
*/

interface Vehicle2
{
    fun drive()
}

open class Car2
{
    fun honk() = println("Car is honking!")
}

object MyCar2 : Car2(), Vehicle2
{
    override fun drive()
    {
        println("Driving the car")
    }
}

/*
    fun main()
    {
        MyCar.honk()     // Inherited from Car
        MyCar.drive()    // Implemented from Vehicle
    }
*/

/*
    Object Expression -->
    You can also assign an object to a variable !

    val obj = object
    {
        val x:Int = 10
        fun method() {println("I am Object Expression !")}
    }

    println(obj.x)
    obj.method()
*/