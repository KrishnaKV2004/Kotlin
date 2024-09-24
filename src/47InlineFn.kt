/*
    Inline Functions -->

    Inline functions are functions where the compiler inserts the body of the function
    directly at the call site to avoid the overhead of function calls.
    This is especially useful when higher-order functions (i.e., functions that take other
    functions as parameters) are involved, as they reduce the cost of lambda expressions
    by avoiding object allocations.

    Key Points -->
    Inline functions help reduce the performance overhead caused by lambda
    expressions or function calls.
    When a function is marked as inline, the compiler replaces each call to
    that function with the actual code from the function body during compilation.

    Syntax -->

    inline fun functionName(parameters)
    {
        // Function body
    }
*/

inline fun performOperation(operation: () -> Unit)
{
    println("Before operation")
    operation()
    println("After operation")
}

fun main()
{
    performOperation {
        println("Performing operation")
    }
}