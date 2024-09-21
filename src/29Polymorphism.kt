/*
    Polymorphism -->

    Polymorphism is a core concept in object-oriented programming (OOP)
    that allows objects of different classes to be treated as objects of a common superclass.
    It enables one interface to be used for a general class of actions,
    allowing methods to be called on objects of different types
*/

open class Shape
{
    open fun area(): Double
    {
        return 0.0
    }
}

class Circle(private val radius:Double): Shape()
{
    override fun area(): Double
    {
        return Math.PI * radius * radius
    }
}

class Square(private val side:Double): Shape()
{
    override fun area(): Double
    {
        return side * side
    }
}

fun main()
{
    //  val cir: Circle = Circle(4.0)
    //  val sqr: Square = Square(10.0)

    /*
        The above statements will work fine as in overriding, but polymorphism makes
        it possible that parent can hold a reference to its child but call child methods
    */
    //  Let's change the reference to the Shape as Circle and Square are both shapes !

    val cir: Shape = Circle(4.0)
    val sqr: Shape = Square(10.0)

    println("Area Of Circle --> ${cir.area()}")
    println("Area of Square --> ${sqr.area()}")
    println()

    /*
        Advantage -->
        Helps to write maintainable & extensible code !
        Helps in interacting with objects via common interface !
        We can make an Array of type shape and calculate the area of all the shapes
        in the array as shape can hold reference to its children !
    */

    val shapes: Array<Shape> = arrayOf(Circle(4.0), Square(5.0), Circle(5.0))
    calcArea(shapes)
}

fun calcArea(shapes: Array<Shape>)
{
    for(shape:Shape in shapes)
    {
        println("Area --> ${shape.area()}")
    }
}