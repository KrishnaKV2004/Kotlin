//  Constants are declared outside function
//  Value of PI is known before execution and is independent of any code
const val PI = 3.14

//  const val PI = getPIValue() --> Incorrect as it is dependable on getPIValue() to assign value

fun main()
{
    val pi = 3.14   //  Can't be changed but known while execution
    //  val pi = getPIValue() --> No Problem Here !
}

fun getPIValue(): Double = 3.14     //  function that returns 3.14, we will study later about functions !