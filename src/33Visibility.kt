/*
    Visibility Modifiers -->

    In Kotlin, visibility modifiers determine the accessibility of
    classes, objects, interfaces, functions, and properties

    -> public (default)
    -> private
    -> protected
    -> internal

    public (Default Modifier) -->
    Scope: Visible everywhere.
    Classes, Functions, and Properties: If no visibility modifier is specified,
    the member is public by default. A public member can be accessed from anywhere in the project.

    private -->
    Scope: Visible only within the declaring class, file, or object.
    For Members (e.g., variables, functions): The private keyword restricts
    the member to the class or object in which it is declared.
    For Top-Level Declarations: If a function, property, or class is marked
    private at the top level, it is visible only within the file where it is declared.

    protected -->
    Scope: Visible within the class and its subclasses.
    For Members: A protected member is accessible within the class where it is declared
    and in subclasses, but not from outside those classes.
    Important Note: protected does not apply to top-level declarations (functions or classes)

    internal -->
    Scope: Visible within the same module.
    For Members: The internal keyword restricts visibility to the current module
    (e.g., a set of Kotlin files compiled together). Members declared internal are
    accessible anywhere within the same module but not outside of it.
*/

open class VisibilityExample
{
    public var publicVar = "Public"
    private var privateVar = "Private"
    protected var protectedVar = "Protected"
    internal var internalVar = "Internal"

    fun printVisibility()
    {
        println(publicVar)       // Accessible
        println(privateVar)      // Accessible
        println(protectedVar)    // Accessible
        println(internalVar)     // Accessible
    }
}

class ChildVisibility : VisibilityExample()
{
    fun childFunction()
    {
        println(publicVar)       // Accessible
        // println(privateVar)   // Error: privateVar is private
        println(protectedVar)    // Accessible
        println(internalVar)     // Accessible
    }
}