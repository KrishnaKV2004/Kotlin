/*
    Abstract Class -->

    An abstract class is a class that cannot be instantiated directly
    and is designed to be inherited by other classes.
    It can contain both abstract methods (which are declared but not implemented)
    and non-abstract (concrete) methods or properties.
    The primary purpose of an abstract class is to serve as a blueprint for other classes.

    Need for Abstract Class -->

    -> Partial Implementation: An abstract class provides a way to implement shared
       functionality that can be used by child classes while leaving some methods
       unimplemented (abstract), allowing the child classes to implement specific behaviors.
    -> Encapsulation of Common Code: You can encapsulate common logic that multiple subclasses
       will share. This reduces code duplication and helps with code organization.
    -> Contract Definition: Like an interface, an abstract class defines a contract that must
       be followed by its subclasses, but it also allows sharing state and behavior among subclasses.

    Key Features -->

    -> Cannot be instantiated: You cannot create an object of an abstract class directly.
    -> Can have abstract and non-abstract members: Abstract classes can contain abstract
       methods (without body) that must be overridden in subclasses and non-abstract methods
       (with body) that can be inherited as is.
    -> Inheritance Requirement: Other classes that inherit from an abstract class must provide
       implementations for its abstract members.

    Uses of Abstract Class -->

    -> Defining Common Behaviors: If you have multiple classes with common behavior, an abstract class
       can define that behavior while allowing the subclasses to provide specialized implementations
       for certain methods.
    -> Reusable Components: When you want to create a base class that shares some logic across subclasses
       but isn't intended to be used on its own, an abstract class can help modularize that functionality.
    -> Framework and API Design: In Kotlin, abstract classes are often used in frameworks or
       libraries to define core functionality that can be extended by developers for specific use cases
*/

// Abstract class with both abstract and non-abstract members

abstract class Animal
{
    abstract fun makeSound() // Abstract method
    fun eat() {println("Eating food")}  //  Non-Abstract Method
}

// Subclass inheriting the abstract class

class Dog : Animal()
{
    override fun makeSound() {println("Woof")}
}

fun main()
{
    val dog = Dog()
    dog.makeSound()  // Outputs: Woof
    dog.eat()        // Outputs: Eating food
}