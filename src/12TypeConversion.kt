//  Type Conversion -->

fun main()
{
    val num1 = 10
    val num2 = 20
    val num3 = "10"
    val num4 = "20"

    //  println(num1 + num3) --> Error as one is Int and other is String

    println(num1.toString() + num3) //  num1 converted to String
    println(num1 + num4.toInt())    //  num4 converted to Int
}