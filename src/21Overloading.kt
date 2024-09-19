/*
    Function Overloading -->

    When two or more functions have same name but behaves differently
    can be achieved by having same name but different parameters (type, numbers)
*/

import kotlin.math.pow
fun main()
{
    println(addition(2,4))
    println(addition(5.0,15.0))

    //  In Kotlin, you can change the sequence of parameters and still can have correct output
    //  as it has a concept of named arguments -->

    println(addition(b=2, a=7))

    //  In Kotlin, you can also store the functions in variables -->

    val fn = :: mul
    println(fn(2,9))
    //  Here you can see that fn is working as mul

    //  You can also specify type of function variable to accept only specific type of function
    val func: (a:Double, b:Double) -> Double = :: power
    println(func(2.0,8.0))
}

fun addition(a:Int, b:Int): Int
{
    return a+b
}

fun addition(a:Double, b:Double): Double
{
    return a+b
}

fun mul(a:Int, b:Int): Int
{
    return a*b
}

fun power(a:Double, b:Double): Double
{
    return a.pow(b)
}   