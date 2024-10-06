//  Coffee Machine -->

data class CoffeeDetails (
    val name: String,
    val sugarCount: Int,
    val size: String,
    val creamAmount: Int
)

fun askDetails():CoffeeDetails
{
    print("Your Name --> ")
    val name: String = readln()
    print("Sugar [Count] --> ")
    val sugar = readln()
    val sugarCount = sugar.toInt()
    print("Size [Small, Medium, Large] --> ")
    val size: String = readln()
    print("Cream Amount [ml] --> ")
    val cream = readln()
    val creamAmount = cream.toInt()
    println()

    return CoffeeDetails(name, sugarCount, size, creamAmount)
}

fun makeCoffee(details: CoffeeDetails)
{
    println("Starting Machine !")
    Thread.sleep(1500)
    println("Boiling Water !")
    Thread.sleep(1500)
    println("Grinding Coffee Beans !")
    Thread.sleep(1500)
    println("Brewing Coffee !")
    Thread.sleep(1500)

    if(details.sugarCount == 1)
    {
        println("Adding ${details.sugarCount} Cube Sugar !")
        Thread.sleep(1500)
    }
    else if(details.sugarCount > 1)
    {
        println("Adding ${details.sugarCount} Cubes Sugar !")
        Thread.sleep(1500)
    }

    println("Adding Milk !")
    Thread.sleep(1500)
    println("Adding ${details.creamAmount} ml Cream !")
    Thread.sleep(1500)
    println()

    println("${details.size} Coffee For ${details.name} Is Ready !")
    Thread.sleep(1500)
}

fun main()
{
    println("Coffee Machine -->\n")

    while (true)
    {
        val coffeeDetails = askDetails()

        makeCoffee(coffeeDetails)

        println()
        print("Wanna Make Another Coffee ? [Yes/No] --> ")
        val response = readln().lowercase()

        if (response != "yes")
        {
            println()
            println("Shutting Down The Coffee Machine !")
            Thread.sleep(2000)
            break
        }
        println()
    }
}