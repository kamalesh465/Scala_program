object Factorial {
  def main(args: Array[String]): Unit = {

    print("Enter a number: ")
    val n = scala.io.StdIn.readInt()

    var fact = 1

    if (n < 0) {
      println("Factorial is not possible for negative numbers")
    } else {
      for (i <- 1 to n) {
        fact = fact * i
      }

      println("Factorial = " + fact)
    }
  }
}