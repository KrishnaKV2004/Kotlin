import kotlin.system.exitProcess

// Data Models for Books and Library Users

data class Book (
    val id: Int,
    val title: String,
    val author: String,
    var isAvailable: Boolean = true // Indicates if the book is available for borrowing
)

data class LibPerson (
    val libPersonId: Int,
    val name: String
)

// Repository to Manage Library Data

class LibraryRepository
{
    private val books = mutableListOf<Book>()               // Holds the list of books in the library
    private val borrowedBooks = mutableMapOf<Int, Int>()    // Maps libPersonId to bookId for borrowed books

    // Adds a book to the library

    fun addBook(book: Book)
    {
        books.add(book)
    }

    // Retrieves a list of all available books

    fun getAvailableBooks(): List<Book> {
        return books.filter { it.isAvailable }
    }

    // Borrows a book

    fun borrowBook(libPerson: LibPerson, bookId: Int): String
    {
        val book = books.find { it.id == bookId && it.isAvailable }
        return if (book != null)
        {
            book.isAvailable = false
            borrowedBooks[libPerson.libPersonId] = book.id
            "Book borrowed: ${book.title} by ${libPerson.name}"
        }
        else
        {
            "Book is not available or does not exist."
        }
    }

    // Returns a book

    fun returnBook(libPerson: LibPerson): String
    {
        val borrowedBookId = borrowedBooks[libPerson.libPersonId]
        val book = books.find { it.id == borrowedBookId }
        return if (book != null)
        {
            book.isAvailable = true
            borrowedBooks.remove(libPerson.libPersonId)
            "Book returned: ${book.title} by ${libPerson.name}"
        }
        else
        {
            "No borrowed book found for ${libPerson.name}."
        }
    }
}

// Main Menu

fun main()
{
    val library = LibraryRepository()
    val libPerson = LibPerson(libPersonId = 1, name = "Tokyo")

    // Add some initial books

    library.addBook(Book(id = 1, title = "The Kotlin Handbook", author = "Jane Doe"))
    library.addBook(Book(id = 2, title = "Coroutines in Depth", author = "John Smith"))
    library.addBook(Book(id = 3, title = "Mastering Concurrency", author = "Alice Johnson"))

    // Display menu to the user

    while (true)
    {
        println("\nLibrary Management System")
        println("1. View available books")
        println("2. Borrow a book")
        println("3. Return a book")
        println("4. Exit")
        print("Enter your choice: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> viewAvailableBooks(library)
            2 -> borrowBook(library, libPerson)
            3 -> returnBook(library, libPerson)
            4 -> exitProcess(0)
            else -> println("Invalid choice. Please try again.")
        }
    }
}

// View available books

fun viewAvailableBooks(library: LibraryRepository)
{
    println("\nAvailable Books:")
    val availableBooks = library.getAvailableBooks()
    if (availableBooks.isNotEmpty()) {
        availableBooks.forEach { book -> println("ID: ${book.id}, Title: ${book.title}, Author: ${book.author}") }
    }
    else
    {
        println("No books available at the moment.")
    }
}

// Borrow a book

fun borrowBook(library: LibraryRepository, libPerson: LibPerson)
{
    println("\nEnter the ID of the book to borrow:")
    val bookId = readlnOrNull()?.toIntOrNull()

    if (bookId != null)
    {
        val result = library.borrowBook(libPerson, bookId)
        println(result)
    }
    else
    {
        println("Invalid book ID.")
    }
}

// Return a book

fun returnBook(library: LibraryRepository, libPerson: LibPerson)
{
    val result = library.returnBook(libPerson)
    println(result)
}