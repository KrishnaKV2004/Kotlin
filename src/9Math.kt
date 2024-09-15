/*
    Math in Kotlin -->

    In Kotlin, the kotlin.math package provides a variety of mathematical functions and constants.
    This package includes functions for trigonometry, logarithms, rounding, power operations, and more.
    It is similar to the java.lang.Math class in Java but designed for Kotlin.
*/

import kotlin.math.*

fun main()
{
    val num1 = 20
    val num2 = 10
    val num3 = 2.0

    println("Max --> ${max(num1, num2)}")
    println("Min --> ${min(num1, num2)}")
    println("Power --> ${num3.pow(8.0)}")

    //  There are many more Math functions you can try !
}