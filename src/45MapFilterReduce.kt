/*
    Build In Higher Order Functions -->

    In Kotlin, map, filter, and reduce are higher-order functions commonly
    used to manipulate collections (like lists). These functions allow you to
    process collections in a functional programming style, making your code
    more concise and expressive.

    Overview of map, filter, and reduce -->

    map:
    Purpose: Transforms each element in the collection and returns a new
    collection with the transformed elements.
    Example Use Case: If you want to apply a mathematical operation or
    convert each element into a different type.

    filter:
    Purpose: Filters elements of a collection based on a condition (predicate)
    and returns a new collection containing only the elements that satisfy the condition.
    Example Use Case: If you want to select only the elements that meet
    a specific criterion (like even numbers).

    reduce:
    Purpose: Combines all elements of a collection into a single value
    by applying a function repeatedly.
    Example Use Case: If you want to calculate the sum, product, or any
    aggregation over all elements.
*/

fun main()
{
    //  Map -->
    val num = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = num.map { it * it }
    println(squaredNumbers)  // Output: [1, 4, 9, 16, 25]

    //  Reduce -->
    val nums = listOf(1, 2, 3, 4, 5)
    val sum = nums.reduce { acc, number -> acc + number }
    println(sum)  // Output: 15

    //  Filter -->
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)  // Output: [2, 4]
    println()

    /*
        Practical Example: Combining map, filter, and reduce

        Let's say you want to -->

        Take a list of numbers.
        Filter out the odd numbers.
        Square the remaining even numbers.
        Calculate the sum of the squared values.
    */

    val numb = listOf(1, 2, 3, 4, 5)
    val result = numb
        .filter { it % 2 == 0 }                     // Step 1: Filter even numbers
        .map { it * it }                            // Step 2: Square each number
        .reduce { acc, number -> acc + number }     // Step 3: Sum the squared numbers

    println(result)  // Output: 20
}