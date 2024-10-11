import java.util.Scanner

// Data class to represent a Bank Account -->

data class BankAccount
    (
        val accountNumber: String,
        var accountHolder: String,
        var balance: Double,
        var isActive: Boolean = true
    )

// Class to manage the Bank operations -->

class Bank
{
    private val accounts = mutableListOf<BankAccount> ()

    // Open a new account -->

    fun openAccount(accountNumber: String, accountHolder: String, initialDeposit: Double)
    {
        val newAccount = BankAccount(accountNumber, accountHolder, initialDeposit)
        accounts.add(newAccount)
        println("Account Opened For $accountHolder With Account Number $accountNumber !")
    }

    // Delete an account -->

    fun deleteAccount(accountNumber: String)
    {
        val account = findAccount(accountNumber)

        if (account != null)
        {
            account.isActive = false
            println("Account $accountNumber Has Been Closed !")
        }
        else
        {
            println("Account Not Found !")
        }
    }

    // Deposit money into the account -->

    fun deposit(accountNumber: String, amount: Double)
    {
        val account = findAccount(accountNumber)

        if (account != null && account.isActive)
        {
            account.balance += amount
            println("Deposited $amount To Account $accountNumber !\nNew Balance --> ${account.balance}")
        }
        else
        {
            println("Account Not Found Or Closed !")
        }
    }

    // Withdraw money from the account -->

    fun withdraw(accountNumber: String, amount: Double)
    {
        val account = findAccount(accountNumber)

        if (account != null && account.isActive)
        {
            if (account.balance >= amount)
            {
                account.balance -= amount
                println("Withdrew $amount From Account $accountNumber !\nNew Balance --> ${account.balance}")
            }
            else
            {
                println("Insufficient Balance !")
            }
        }
        else
        {
            println("Account Not Found Or Closed !")
        }
    }

    // Check account balance -->

    fun checkBalance(accountNumber: String)
    {
        val account = findAccount(accountNumber)

        if (account != null && account.isActive)
        {
            println("Balance For Account $accountNumber --> ${account.balance}")
        }
        else
        {
            println("Account Not Found Or Closed !")
        }
    }

    // Card management (example: requesting a card) -->

    fun requestCard(accountNumber: String)
    {
        val account = findAccount(accountNumber)

        if (account != null && account.isActive)
        {
            println("Card Requested For Account Number $accountNumber !")
        }
        else
        {
            println("Account Not Found Or Closed !")
        }
    }

    // Helper method to find an account by account number -->

    private fun findAccount(accountNumber: String): BankAccount?
    {
        return accounts.find { it.accountNumber == accountNumber && it.isActive }
    }
}

// Main function to handle runtime input -->

fun main()
{
    val bank = Bank()
    val scanner = Scanner(System.`in`)

    while (true)
    {
        println()
        println("#------ Banking System -------#")
        println()
        println("[1] Open Account")
        println("[2] Delete Account")
        println("[3] Deposit Money")
        println("[4] Withdraw Money")
        println("[5] Check Balance")
        println("[6] Request Card")
        println("[7] Exit")
        println()
        print("Enter your choice --> ")

        when (scanner.nextInt())
        {
            1 ->
                {
                    println()
                    print("Enter Account Number --> ")
                    val accountNumber = scanner.next()
                    print("Enter Account Holder Name --> ")
                    val accountHolder = scanner.next()
                    print("Enter Initial Deposit Amount --> ")
                    val initialDeposit = scanner.nextDouble()
                    bank.openAccount(accountNumber, accountHolder, initialDeposit)
                }

            2 ->
                {
                    println()
                    print("Enter Account Number To Delete --> ")
                    val accountNumber = scanner.next()
                    bank.deleteAccount(accountNumber)
                }

            3 ->
                {
                    println()
                    print("Enter Account Number To Deposit --> ")
                    val accountNumber = scanner.next()
                    print("Enter Amount To Deposit --> ")
                    val amount = scanner.nextDouble()
                    bank.deposit(accountNumber, amount)
                }

            4 ->
                {
                    println()
                    print("Enter Account Number To Withdraw From --> ")
                    val accountNumber = scanner.next()
                    print("Enter Amount To Withdraw --> ")
                    val amount = scanner.nextDouble()
                    bank.withdraw(accountNumber, amount)
                }

            5 ->
                {
                    println()
                    print("Enter Account Number To Check Balance --> ")
                    val accountNumber = scanner.next()
                    bank.checkBalance(accountNumber)
                }

            6 ->
                {
                    println()
                    print("Enter Account Number To Request A Card --> ")
                    val accountNumber = scanner.next()
                    bank.requestCard(accountNumber)
                }

            7 ->
                {
                    println()
                    println("Exiting... Thank You For Using The Banking System !")
                    break
                }

            else ->
                {
                    println()
                    println("Invalid Choice, Please Try Again !")
                }
        }
    }
}