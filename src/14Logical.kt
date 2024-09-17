//  Logical Operators -->

fun main()
{
    val isAdult = true
    val isMale = false
    val isDriver = true

    println(isAdult && isDriver)    //  Returns true if both operands are true
    println(isAdult || isMale)      //  At least one condition should be true
    println(!isMale)                //  Inverts the value
}