/*
    OOPS -->
    Object Oriented Programming is a paradigm which allows us to solve problems
    with the help of objects which represents the real world entities

    Class is a blueprint or template
    Objects are real world entities
    You can create objects in your program so that they interact with each other
    and complete the work

    Design a class -->
    Properties or Fields (Object knows)
    Methods (Object does)

    Syntax -->

    class name (properties)
    {
        Methods
    }
*/

class Car(val name:String, val type:String, var mileage:Int)
{
    fun startCar()
    {
        println("$name Started !")
    }

    fun stopCar()
    {
        println("$name Stopped !")
    }
}
fun main()
{
    //  Making an object of class Car -->
    val lexus = Car("Lexus IS 500","Diesel", 500)

    //  Accessing properties of class -->
    println("Name --> ${lexus.name}")
    println("Type --> ${lexus.type}")
    println("Mileage --> ${lexus.mileage}")

    //  Accessing Methods -->
    lexus.startCar()
    lexus.stopCar()
}