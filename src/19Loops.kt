//  Loops In Kotlin

fun main()
{
    var count = 5

    //  While loop runs until condition is true
    while(count >= 1)
    {
        println("Hello")
        count--
    }
    println()

    //  Do-While loop first executes then checks condition
    do
    {
        println("Hi")
    }while(count > 0)   //  Runs 1 time then checked the condition which is false

    println()

    //  For loop

    //  range -->
    //  Upper bound is included in range
    for(i in 1..5 step 2)
    {
        println(i)
    }
    println()

    //  until -->
    //  Upper bound is not included in until
    for(j in 1 until 5)
    {
        println(j)
    }
    println()

    //  downTo -->
    //  lower bound is included
    for(k in 10 downTo 1)
    {
        println(k)
    }
}