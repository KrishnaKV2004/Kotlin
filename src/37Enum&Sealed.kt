/*
    Enum and Sealed Classes -->
    In Kotlin, both enum classes and sealed classes are used to represent a restricted
    set of values, but they serve different purposes and have different use cases.

    Enum Classes -->
    An enum class in Kotlin is used to define a set of constants that represent a
    specific type of data. Each constant in an enum is an object, and an enum class
    can also have properties and methods.

    Key Features of Enum Classes -->
    Fixed Set of Constants: Enums define a finite set of possible values
    (like days of the week, directions, etc.).
    Properties and Methods: Enum constants can have properties and methods.
    Switching: You can use when with enums to perform different actions
    for each enum constant.

    Sealed Classes -->
    A sealed class is used when you need to represent a restricted hierarchy,
    where a class can have multiple types but is restricted to a specific set of subclasses.
    Unlike enums, sealed classes can hold instances of different data types.

    Key Features of Sealed Classes -->
    Restricting Inheritance: All subclasses must be declared in the same file,
    enforcing a limited set of possible subclasses.
    Flexible Data Representation: Sealed classes allow different data types
    and methods in their subclasses.
    Pattern Matching with when: Like enums, when can be used with sealed classes,
    and all branches are covered (no need for an else block).
    Can Hold State: Sealed classes can hold different data types, making them
    more flexible than enums.
*/

enum class Day(val num:Int)
{
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printDay() {println("Day is $this")}
}

enum class TrafficLight
{
    RED, YELLOW, GREEN
}

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success with data: ${result.data}")
        is Result.Error -> println("Error occurred: ${result.message}")
    }
}

fun main()
{
    val day = Day.MONDAY
    day.printDay()
    println()

    //  Enum with when -->
    
    val signal = TrafficLight.RED
    val action = when (signal) {
        TrafficLight.RED -> "Stop"
        TrafficLight.YELLOW -> "Caution"
        TrafficLight.GREEN -> "Go"
    }
    println("Action: $action") // Output: Action: Stop
    println()

    //  Sealed Class -->

    val successResult = Result.Success("Operation completed")
    val errorResult = Result.Error("Something went wrong")

    handleResult(successResult)  // Output: Success with data: Operation completed
    handleResult(errorResult)    // Output: Error occurred: Something went wrong
}