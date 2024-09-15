fun main()
{
    val user1 = "Seoul"
    val user2 = "Tokyo"
    var user3 = "Seoul"

    println(user1 == user3)         //  true
    println(user1.equals(user2))    //  false

    //  Will return true because user1 and user3 are pointing to same memory location
    println(user1 === user3)    //  true

    //  Now we have used a Constructor which we will study later, which is now pointing to different location
    user3 = String("Seoul".toCharArray())
    println(user1 === user3)    //  false
}