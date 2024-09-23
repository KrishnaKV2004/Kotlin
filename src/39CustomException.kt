//  Custom Exception -->

class InvalidInputException(message: String) : Exception(message)

fun validateInput(input: Int)
{
    if (input < 0)
    {
        throw InvalidInputException("Input cannot be negative !")
    }
    else
    {
        println("Valid Input --> $input")
    }
}

fun main()
{
    try
    {
        print("Enter Input --> ")
        val input = readln()
        validateInput(input.toInt())
    }
    catch (e: InvalidInputException)
    {
        println(e.message)
    }
}