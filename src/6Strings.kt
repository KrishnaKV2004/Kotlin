fun main()
{
    //  String Properties and Methods -->

    val name = "Seoul"

    println(name[0])
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name.isEmpty())

    //  And there are many more you can study from Docs

    //  String Template ->

    println()

    val user = "Tokyo"
    val age = 20
    val message = "Hello, I am $name and my age is $age"

    //  {} are used when making calls or expressions
    val mess = "I am from ${name.uppercase()} and in February I will be ${age + 1}"

    println(message)
    println(mess)

    //  Multiline String -->

    val email = """
        My Email is %s
        Nice To Meet You !
    """.trimIndent()    //  %s here specifies string format passed as argument

    println(email.format("seoul.r34@gmail.com"))  //  Pass the email here or write directly in email variable
}