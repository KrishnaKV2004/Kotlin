/*
    Functions -->

    Block of code which performs a specific functionality
    Helps to reuse code

    Syntax -->

    fun functionname(parameter1, parameter2...): ReturnType
    {
        Block of statements
        return result
    }

    Values passed while calling a function are called arguments
    while values received by function are called parameters
*/

fun main()
{
    val n1 = 2
    val n2 = 7

    val addition = add(n1, n2)
    println(addition)
    val subtraction = sub(n2, n1)
    println(subtraction)
}

//  Function to add two numbers -->

fun add(num1:Int, num2:Int): Int
{
    val sum = num1 + num2
    return sum
}

//  Inline Function -->

fun sub(num1:Int, num2:Int) = num1 - num2

//  By default, if function is not returning anything or void we can use return type as Unit or skip it