/*
    Exception Handling In Kotlin -->

    An exception in Kotlin (and other programming languages) is an unexpected event
    or error that occurs during the execution of a program. This can disrupt the normal
    flow of the program and potentially cause it to crash if not handled properly.

    Common causes of exceptions include -->

    -> Dividing by zero
    -> Accessing an invalid index in an array
    -> Trying to open a file that doesn't exist
    -> Invalid user inputs
    -> Network or database connection failures

    In Kotlin, exceptions are represented by the Exception class and its subclasses.
    If an exception is not caught and handled, it will propagate up the call stack
    and may terminate the program.

    Exception handling is the process of anticipating, detecting, and handling exceptions
    that may arise during the execution of a program. In Kotlin, you handle exceptions
    using try, catch, finally, and throw.

    Syntax for Exception Handling in Kotlin -->

    try-catch block: Used to catch exceptions and handle them gracefully.
    finally block: (optional) Used to execute code after try and catch,
    whether an exception occurred or not.
    throw: Used to throw an exception manually.

    try
    {
        // Code that might throw an exception
    }
    catch (e: ExceptionType)
    {
        // Code to handle the exception
    }
    finally
    {
        // (Optional) Code that is always executed, regardless of whether an exception occurs
    }
*/

/*
    Throwing Exception -->

    You can throw exceptions explicitly in Kotlin using the throw keyword.
    This is useful when you want to signal that something went wrong in your code.
*/

fun checkAge(age: Int)
{
    if (age < 18)
    {
        throw IllegalArgumentException("Age must be 18 or above !")
    }
    else
    {
        println("Age is valid !")
    }
}

fun main()
{
    val arr: Array<Int> = arrayOf(1,2,3,4)

    //  Try Catch -->

    try
    {
        println(arr[5])
    }
    catch (_: Exception)
    {
        println("Exception Occurred !")
    }
    finally
    {
        println("Continue -->")    //   Will execute no matter what !
    }

    println()

    //  Throwing Exceptions -->

    try
    {
        print("Enter Age --> ")
        val age = readln()
        checkAge(age.toInt())
    }
    catch (e: IllegalArgumentException)
    {
        println(e.message)
    }
}