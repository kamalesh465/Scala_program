object ATM {

  var balance: Double = 10000.0

  // Method creation - check balance
  def checkBalance(): Unit = {
    println(f"Current Balance: ?$balance%.2f")
  }

  // Method creation - deposit
  def deposit(amount: Double): Unit = {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount should be greater than zero")
    }

    balance += amount
    println(f"?$amount%.2f deposited successfully")
  }

  // Method creation - withdrawal
  def withdraw(amount: Double): Unit = {
    if (amount <= 0) {
      throw new IllegalArgumentException("Amount should be greater than zero")
    }

    if (amount > balance) {
      throw new IllegalArgumentException("Insufficient balance")
    }

    balance -= amount
    println(f"?$amount%.2f withdrawn successfully")
  }

  // Pattern matching
  def processChoice(choice: Int): Boolean = {

    choice match {

      case 1 =>
        checkBalance()
        true

      case 2 =>
        print("Enter amount to deposit: ")
        val amount = scala.io.StdIn.readLine().toDouble
        deposit(amount)
        true

      case 3 =>
        print("Enter amount to withdraw: ")
        val amount = scala.io.StdIn.readLine().toDouble
        withdraw(amount)
        true

      case 4 =>
        println("Thank you!")
        false

      case _ =>
        println("Invalid choice")
        true
    }
  }

  def main(args: Array[String]): Unit = {

    var running = true

    while (running) {

      println("\n===== ATM MENU =====")
      println("1. Check Balance")
      println("2. Deposit")
      println("3. Withdraw")
      println("4. Exit")
      print("Enter your choice: ")

      try {
        val choice = scala.io.StdIn.readLine().toInt
        running = processChoice(choice)

      } catch {
        case _: NumberFormatException =>
          println("Error: Please enter a valid number.")

        case e: IllegalArgumentException =>
          println(s"Error: ${e.getMessage}")

        case e: Exception =>
          println(s"Unexpected error: ${e.getMessage}")
      }
    }
  }
}