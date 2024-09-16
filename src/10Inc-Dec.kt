/*
    Increment Decrement Operator -->

    Increment (++) and Decrement (--) operators are used to increase or decrease the value of a variable by 1.
    These operators can be applied to variables of numeric types such as Int, Double, etc.

    There are two types of increment and decrement operators -->

    1.  Pre-Increment / Pre-Decrement Operators
    2.  Post-Increment / Post-Decrement Operators
*/

fun main()
{
    //  Pre-Increment and Pre-Decrement -->

    var a = 5
    val result1 = ++a  // (a) is incremented to 6, then result1 is assigned the value of a (6)
    println(result1)   // Output: 6
    println(a)         // Output: 6

    var b = 5
    val result2 = --b  // (b) is decremented to 4, then result2 is assigned the value of b (4)
    println(result2)   // Output: 4
    println(b)         // Output: 4

    //  Post-Increment and Post-Decrement -->

    var x = 5
    val result3 = x++  // result3 is assigned the value of x (5), then x is incremented to 6
    println(result3)   // Output: 5
    println(x)         // Output: 6

    var y = 5
    val result4 = y--  // result4 is assigned the value of y (5), then y is decremented to 4
    println(result4)   // Output: 5
    println(y)         // Output: 4

    /*
        Key Points -->

        Pre-Increment/Decrement affects the variable first and then uses it in the expression.
        Post-Increment/Decrement uses the variable first and then increments or decrements it afterward.
        This is useful in loops or any situation where you need to change a value iteratively.
    */
}