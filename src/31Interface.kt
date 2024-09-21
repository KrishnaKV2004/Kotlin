/*
    Interface -->

    An interface is a contract that defines a set of methods and properties
    that a class can implement. Unlike an abstract class, an interface cannot provide
    any implementation for its methods (except for default implementations) and cannot
    store state (no properties with backing fields).

    Key Features of Interfaces -->

    -> No State: Interfaces cannot have fields. They can define properties,
       but those properties cannot hold data—they can only be abstract or provide default implementations.
    -> Multiple Inheritance: A class can implement multiple interfaces, allowing for a flexible design.
       This helps avoid the limitations of single inheritance found in classes.
    -> Default Implementations: Interfaces can provide default implementations for some methods.
       This allows classes that implement the interface to use the default behavior or override it as needed.

    Need for Interfaces -->

    Defining Contracts: Interfaces allow you to define a contract that multiple classes can adhere to,
    ensuring that they implement specific methods.
    Multiple Implementations: They enable different classes to provide their own implementations
    of the same methods, promoting polymorphism.
    Loose Coupling: Interfaces can help in designing loosely coupled systems,
    making it easier to replace or modify implementations without affecting the code that uses them.
*/

// Interface definition
interface Vehicle
{
    val wheels: Int        // Abstract property
    fun start()            // Abstract method
    fun stop() {println("The vehicle has stopped.")}    //  Default implementation
}

// Class implementing the Vehicle interface for a Car
class Cars : Vehicle
{
    override val wheels: Int = 4
    override fun start() {println("The car is starting.")}
}

// Class implementing the Vehicle interface for a Bike
class Bikes : Vehicle
{
    override val wheels: Int = 2
    override fun start() {println("The bike is starting.")}
}

// Class implementing the Vehicle interface for a Truck
class Trucks : Vehicle
{
    override val wheels: Int = 6
    override fun start() {println("The truck is starting.")}
}

fun main()
{
    val myCar: Vehicle = Cars()
    myCar.start()      // Outputs: The car is starting.
    println("Wheels: ${myCar.wheels}") // Outputs: Wheels: 4
    myCar.stop()       // Outputs: The vehicle has stopped.
    println()

    val myBike: Vehicle = Bikes()
    myBike.start()     // Outputs: The bike is starting.
    println("Wheels: ${myBike.wheels}") // Outputs: Wheels: 2
    myBike.stop()      // Outputs: The vehicle has stopped.
    println()

    val myTruck: Vehicle = Trucks()
    myTruck.start()    // Outputs: The truck is starting.
    println("Wheels: ${myTruck.wheels}") // Outputs: Wheels: 6
    myTruck.stop()     // Outputs: The vehicle has stopped.
    println()
}

/*
    When to Use Interfaces -->

    -> When you want to define a contract that multiple classes should implement.
    -> When you need to achieve polymorphism, allowing different classes to be treated
       uniformly based on the interface.
    -> When you want to promote loose coupling and flexibility in your codebase.

    Comparison with Abstract Classes -->

    -> Instantiation: Interfaces cannot be instantiated,
       abstract classes cannot be instantiated either.
    -> State: Interfaces cannot have state; abstract classes can have both
       abstract and concrete members, including state.
    -> Multiple Inheritance: A class can implement multiple interfaces,
       while it can inherit from only one abstract class.
*/