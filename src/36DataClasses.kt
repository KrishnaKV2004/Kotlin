/*
    Data Classes -->

    In Kotlin, a data class is a special type of class that is primarily used to hold data.
    Kotlin automatically generates useful methods for data classes, such as equals(), hashCode(),
    toString(), copy(), and componentN() methods, which reduce the amount of boilerplate code.

    To declare a data class, you use the data keyword before the class declaration !

    Benefits of Data Classes -->

    Automatic toString(): Generates a toString() method that prints the properties of the class.
    Automatic equals() and hashCode(): Automatically generates equals() and hashCode()
    based on the properties, which is useful for comparing objects and using them in collections
    like sets and maps.
    copy() function: Allows you to create a copy of an object with optional modification of some properties.
    componentN() functions: For destructuring declarations.
*/

data class Users(val name: String, val age: Int)

fun main()
{
    val user1 = Users("Alice", 25)

    // toString() - Prints the object with property names
    println(user1)  // Outputs: User(name=Alice, age=25)

    // equals() - Compares objects by their properties
    val user2 = Users("Alice", 25)
    println(user1 == user2)  // Outputs: true

    // copy() - Creates a copy of the object with optional property change
    val user3 = user1.copy(age = 26)
    println(user3)  // Outputs: User(name=Alice, age=26)

    // Destructuring declarations
    val (name, age) = user1
    println("Name: $name, Age: $age")  // Outputs: Name: Alice, Age: 25
}