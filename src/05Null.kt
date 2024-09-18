/*
    There is Null Safety in Kotlin
    that ensures that a type in kotlin can never hold a null value by default
*/

fun main()
{
    var name = null     //  Prints null because compiler implicitly considers it as Nothing? type
    //  name = "Krishna"    -->     You can't change it because name is of Nothing? type
    println(name)

    //  Let's try with explicit types -->

    //  var user: String = null --> Error as it can't be null
    var user: String = "Seoul"
    //  user = null --> Error

    //  This helps to avoid problem of Null Pointers Exception (NPE) which is a frequent source of crashes
    //  To allow a variable to hold a null value we mark the type explicitly with a ?

    var username: String? = "Tokyo"

    println("User --> ${user.uppercase()}")
    //  println("Username --> ${username.uppercase()}") --> Can't make calls as String can be null

    println("Username --> ${username?.uppercase()}")    //  Safety calls are used with ?.
}