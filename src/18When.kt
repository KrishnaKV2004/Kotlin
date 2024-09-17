//  When statement in Kotlin

fun main()
{
    val gender = 'F'

    //  Like Switch Case In C/C++ but with diff Syntax and Keyword -->

    when (gender)
    {
        'F' -> println("Female")
        'M' -> println("Male")
        else ->
        {
            println("Unknown")
        }
    }

    val age = 20

    when (age)
    {
        in 13..17 -> println("Teenager")
        in 18..50 -> println("Adult")
        else ->
        {
            println("Senior")
        }
    }

    //  When Booleans are null -->

    val bool1 = true
    val bool2: Boolean? = null

    if (bool1)  //  No need to check as it can't be null
    {
        println(":)")
    }

    //  if (bool2)  --> Error as bool2 can be null

    if (bool2 == true)
    {
        println("True")
    }
    else
    {
        println("False Or Null")
    }
}