class User(nameparam:String, ageparam:Int)
{
    var name: String = nameparam
        get()
        {
            //  Getter method written after name to get it
            return field.uppercase()
        }
    var age: Int = ageparam
        set(value)
        {
            //  Setter method written just after age to set it
            if(value > 0)
            {
                field = value
                println(value)
            }
            else
            {
                println(value)
                println("Age can't be -ve !")
            }
        }
}

fun main()
{
    val user = User("Krishna", 20)
    user.age = 18
    user.age = -12
    println("Name --> ${user.name}")
}

/*
    Default Get Set Methods -->
    when you don't define any getter or setter

    get () = field
    set(value)
    {
        field = value
    }
*/