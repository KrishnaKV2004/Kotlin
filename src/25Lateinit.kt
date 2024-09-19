class calculator    //  If you don't provide any constructor, Kotlin will apply default constructor
{
    //  lateinit is used when we want to initialize variable later, can't be val, Int, Boolean, Float
    lateinit var message: String

    fun add(a:Int, b:Int): Int
    {
        return a+b
    }
    fun subtract(a:Int, b:Int): Int
    {
        return a-b
    }
    fun multiply(a:Int, b:Int): Int
    {
        return a*b
    }
    fun divide(a:Int, b:Int): Int
    {
        return a/b
    }
}

fun main()
{
    val calc = calculator()

    println(calc.add(2,7))
    println(calc.subtract(9,7))
    println(calc.multiply(2,10))
    println(calc.divide(10,5))
}