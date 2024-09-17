import kotlin.reflect.typeOf

//  If Expression -->

fun main()
{
    val n1 = 10
    val n2 = 20

    val value = if(n1 > n2)
    {
        ":("    //  return this string if condition is true
    }
    else
    {
        ":)"    //  else return this string
    }

    println(value)

    //  Ternary Expression -->

    val exp = if (n1 >= n2) ":)" else ":("
    val result =
        if (n2 < n1) ":)"
        else if (n2 == 20) ":|"
        else ":("

    println(exp)
    println(result)
}