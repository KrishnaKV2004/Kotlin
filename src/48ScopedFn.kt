/*
    Scoped Functions -->

    In Kotlin, scoped functions like let, run, apply, also, and with allow
    you to execute a block of code within the context of an object.
    These functions help make your code more concise and readable.

    Here's an explanation of these five scoped functions and when to use each :

    1. let -->

    Purpose: Performs some actions on the object and returns a result.
    Object Reference: Available as it.
    Return Value: The result of the lambda expression.
    Use Case: Use let when you want to operate on an object and return a
    different result, especially for null-checking or chaining operations.

    2. run -->

    Purpose: Executes a block of code and returns the result.
    Object Reference: Available as this.
    Return Value: The result of the lambda expression.
    Use Case: Use run when you want to perform actions on an object and
    return a result, or when initializing objects with complex setup.

    3. apply -->

    Purpose: Configures an object and returns the object itself.
    Object Reference: Available as this.
    Return Value: The original object.
    Use Case: Use apply when you want to modify properties of an object
    and return the same object for further use.

    4. also -->

    Purpose: Performs some actions on an object and returns the same object.
    Object Reference: Available as it.
    Return Value: The original object.
    Use Case: Use also when you want to perform side effects
    (like logging or validation) without modifying the object itself.

    5. with -->

    Purpose: Works with an object and returns a result.
    This is a non-extension function, unlike the others.
    Object Reference: Available as this.
    Return Value: The result of the lambda expression.
    Use Case: Use with when you want to operate on an object without
    extending it or returning the object itself.
*/

data class Persons(var name: String = "", var age: Int = 0, var city: String = "")

fun main()
{
    // 1. `apply`: Configure a new Person object and return the same object.
    val person = Persons().apply {
        name = "Krishna"
        age = 20
        city = "Dehradun"
    }
    println("Person after apply: $person")

    // 2. `let`: Perform actions on the object and return a result (e.g., length of name).
    val nameLength = person.name.let {
        println("Using let, the name is: $it")
        it.length  // Return the length of the name
    }
    println("Name length using let: $nameLength")

    // 3. `run`: Operate on the object, modify and return a result.
    val introduction = person.run {
        "Hi, my name is $name, I am $age years old from $city."
    }
    println("Introduction using run: $introduction")

    // 4. `also`: Perform some actions and return the same object (useful for side effects).
    val updatedPerson = person.also {
        println("Current person: $it")
        it.age += 1  // Increment age by 1
    }
    println("Person after also (age updated): $updatedPerson")

    // 5. `with`: Operate on an object and return a result.
    val details = with(person) {
        "Person details: Name - $name, Age - $age, City - $city."
    }
    println("Details using with: $details")
}

/*
    Summary -->

    Use let for null-checking or chaining operations.
    Use run for executing code blocks and returning results.
    Use apply to configure an object and return it.
    Use also for side effects while keeping the original object.
    Use with when you don’t need an extension function but want to operate on an object.
*/