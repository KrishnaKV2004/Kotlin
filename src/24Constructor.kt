/*
    Constructors -->
    Initializes an object and provide default values to properties
*/

class Automobile()  //  No primary properties
{
    var name: String = ""
    var age: Int = 0
}

class Person(name:String, age:Int)
{
    init    //  Init block executes when object is created, we can have multiple init blocks
    {
        println("$name Verified !")
    }

    //  We use secondary constructor when we need to get some values should be fixed suppose age in this case
    constructor(name:String) : this(name, 20)

    val name = name
    val age = age
    val canVote:Boolean = age > 18
}
fun main()
{
    //  Primary Constructor -->

    var Car = Automobile()
    Car.name = "Lexus"
    Car.age = 10        //  Set value
    println(Car.name)   //  Get Value
    println(Car.age)

    //  Parameterized Constructor -->

    //  var person = Person("Krishna", 20)  --> Normally
    val person = Person("Krishna")  //  With secondary constructor
    println(person.name)
    println(person.age)
    println(person.canVote)
}