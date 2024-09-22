/*
    Key Points -->

    public is the default visibility modifier and allows access from anywhere.
    private restricts access to the class or file in which it's declared.
    protected allows access within the class and its subclasses.
    internal allows access within the same module but not outside it.
*/

fun main()
{
    val example = VisibilityExample()
    println(example.publicVar)   // Accessible
    // println(example.privateVar) // Error: privateVar is private
    // println(example.protectedVar) // Error: protectedVar is protected
    println(example.internalVar) // Accessible within the same module
}