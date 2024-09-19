/*
    Inheritance -->
    A concept of OOPS where a class inherits the properties
    and behaviors from another class
    Makes code reusable
    Cannot inherit from multiple classes
    Parent class constructor is called before child class

    ~ open keyword is used to make a class inheritable !
    To understand the context, refer to 27Inheritance.png file !
*/

open class Phone
{
    var name: String = ""
    var type: String = ""
    var volume: Int = 10

    fun makeCall() {println("Call Made !")}
    fun display() {println("Displayed !")}
    fun powerOff() {println("Powered Off")}
    fun getDeviceInfo() {println("Device Info !")}
}

class BasicPhone(): Phone()
{
    fun getScreenInfo() {println("Screen Info !")}
}

class SmartPhone(): Phone()
{
    fun playMovies() {println("Movie Played !")}
    fun takePicture() {println("Picture Taken !")}
    fun getLocation() {println("Location Displayed !")}
}

fun main()
{
    val mySmartPhone = SmartPhone()
    val myBasicPhone = BasicPhone()

    //  Now I can access all properties of Phone with object of SmartPhone

    mySmartPhone.name = "Samsung 21 FE"
    mySmartPhone.type = "S Series"
    mySmartPhone.volume = 100

    myBasicPhone.name = "Nokia"
    myBasicPhone.type = "3310"
    myBasicPhone.volume = 50

    //  You can also use methods from these classes

    mySmartPhone.playMovies()
    mySmartPhone.makeCall()
    mySmartPhone.getLocation()

    myBasicPhone.getScreenInfo()
    myBasicPhone.makeCall()
}