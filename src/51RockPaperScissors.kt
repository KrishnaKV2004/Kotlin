fun greet(name: String)
{
    println("Hello $name !")
}

fun play(name: String): String
{
    println("\nWhat is Your Choice ? -->\t")
    var userChoice: String = readln()

    var contChoice: String
    var computerChoice: String = ""
    var comChoice = (1..3).random()

    when (comChoice)
    {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }

    if (userChoice == computerChoice)
    {
        println(computerChoice)
        println("Match Draw !")
        println()
    }
    else if ((userChoice == "Rock" && computerChoice == "Paper") || (userChoice == "Paper" && computerChoice == "Scissors") || (userChoice == "Scissors" && computerChoice == "Rock"))
    {
        println(computerChoice)
        println("Computer Won !")
        println()
    }
    else
    {
        println(computerChoice)
        println("$name Won !")
        println()
    }

    print("Do You Want To Continue? (Y/N) -->\t")
    contChoice = readln()

    return contChoice
}

fun main()
{
    print("What Is Your Name? -->\t")
    var name = readln()
    greet(name)

    var contChoice = "Y"

    // Loop until the user enters 'N'
    while (contChoice == "Y")
    {
        contChoice = play(name)
    }

    println("Thank You! Visit Again!")
}