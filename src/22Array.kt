fun main()
{
    //  Arrays -->
    //  Objects that stores multiple values of same type and has fixed size

    //  Implicit Declaration -->
    var nums = arrayOf(1,2,3)
    var names = arrayOf("Tokyo", "Seoul")

    //  Explicit Declaration -->
    var cars: Array<String> = arrayOf<String>("Pagani", "Porsche", "Lexus")

    //  Getting Values -->

    //  Get all elements -->
    for (i in nums)
    {
        println(i)
    }

    for ((i,e) in names.withIndex())
    {
        println("$i --> $e")
    }

    println(cars)   //  Prints Object Memory Reference
    println(nums.contentToString()) //  Prints content in array

    //  Prints at index -->
    println(cars[0])
    println(cars.get(1))

    //  Change element at index -->
    nums.set(0,4)   //  Replace 0th index with 4

    //  Get Array Size -->
    println("Size --> ${cars.size}")
}