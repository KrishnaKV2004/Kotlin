fun main()
{
    val example = VisibilityExample()
    println(example.publicVar)   // Accessible
    // println(example.privateVar) // Error: privateVar is private
    // println(example.protectedVar) // Error: protectedVar is protected
    println(example.internalVar) // Accessible within the same module
}