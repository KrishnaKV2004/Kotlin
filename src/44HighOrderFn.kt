/*
    Higher Order Functions -->

    In Kotlin, higher-order functions are functions that either ->
    Take other functions as parameters.
    Return functions as a result.

    This makes Kotlin very powerful for functional programming since you can
    pass around behavior (functions) just like any other variable.

    Key Concepts of Higher-Order Functions ->

    Function as a Parameter: You can pass a function as an argument to another function.
    Lambda Expressions: Typically used for passing a function as an argument, these are anonymous functions.
    Function as a Return Value: A function can return another function.

    Lambda Expressions:
    Lambda expressions are used to create inline functions that can be passed as arguments.

    Syntax: { parameter -> body }
    val sum = { a: Int, b: Int -> a + b }

    Higher-Order Functions Examples -->

    Passing Functions as Parameters
    You can define a function that takes another function as an argument.
    Returning Functions
    A function can return another function as its result.
*/

// A function that takes another function as a parameter
fun higherOrderFunction(operation: (Int, Int) -> Int, a: Int, b: Int): Int {
    return operation(a, b)
}

// A function that returns another function
fun returnFunction(): (Int, Int) -> Int {
    return { x: Int, y: Int -> x * y }
}

fun main()
{
    // Example 1: Passing a lambda as an argument to a higher-order function
    val sumLambda = { a: Int, b: Int -> a + b }
    val result = higherOrderFunction(sumLambda, 5, 3)
    println("Result of sum: $result")  // Output: 8

    // Example 2: Using a function that returns another function
    val multiplyFunction = returnFunction()
    val multiplicationResult = multiplyFunction(4, 2)
    println("Result of multiplication: $multiplicationResult")  // Output: 8
}

/*
    Explanation -->

    higherOrderFunction:
    This function takes another function (operation) as an argument.
    The operation function has the signature (Int, Int) -> Int, meaning
    it takes two integers and returns an integer. The higherOrderFunction
    calls operation(a, b) and returns the result.

    returnFunction:
    This function returns another function. The returned function takes
    two integers and multiplies them.

    Lambda Expression:
    { a: Int, b: Int -> a + b }: This is an inline function (lambda)
    that sums two integers. It is passed as a parameter to the higher-order
    function higherOrderFunction.

    Common Use Cases ->

    Callbacks: Passing a function to be executed later.
    Functional Utilities: Functions like map(), filter(), and reduce()
    often take lambdas as parameters.
    Returning Functions: Used when you need a function to generate other
    functions dynamically.
*/