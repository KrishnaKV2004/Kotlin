//  Main Function -->

fun main(args: Array<String>)   //  can be empty or command line arguments can be passed
{
    println("Hello World!")     //  Prints on console
    println("Arguments --> ${args.joinToString()}")

    print("Enter Name -->\t")
    val name = readln() //  Reads from input
    println("Hello $name")
}