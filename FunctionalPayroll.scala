object FunctionalPayroll {

  // CURRYING
  // Function takes arguments in two parameter lists
  def calculateTax(salary: Double)(rate: Double): Double = {
    salary * rate / 100
  }

  // CLOSURE
  // The function uses bonusRate from the outer scope
  def createBonusCalculator(bonusRate: Double): Double => Double = {
    (salary: Double) => salary * bonusRate / 100
  }

  def main(args: Array[String]): Unit = {

    // EXPRESSION
    print("Enter basic salary: ")
    val basicSalary = scala.io.StdIn.readLine().toDouble

    print("Enter bonus rate (%): ")
    val bonusRate = scala.io.StdIn.readLine().toDouble

    print("Enter tax rate (%): ")
    val taxRate = scala.io.StdIn.readLine().toDouble

    // CLOSURE
    val bonusCalculator = createBonusCalculator(bonusRate)
    val bonus = bonusCalculator(basicSalary)

    // CURRIED FUNCTION
    val tax = calculateTax(basicSalary + bonus)(taxRate)

    // ANONYMOUS FUNCTION
    val netSalaryCalculator = (salary: Double, bonus: Double, tax: Double) =>
      salary + bonus - tax

    val netSalary = netSalaryCalculator(basicSalary, bonus, tax)

    // EXPRESSION
    val salaryStatus =
      if (netSalary >= 50000)
        "High Salary"
      else
        "Normal Salary"

    println("\n===== PAYROLL DETAILS =====")
    println(f"Basic Salary : ?$basicSalary%.2f")
    println(f"Bonus        : ?$bonus%.2f")
    println(f"Tax          : ?$tax%.2f")
    println(f"Net Salary   : ?$netSalary%.2f")
    println(s"Salary Status: $salaryStatus")
  }
}