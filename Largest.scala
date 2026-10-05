object Largest {
  def main(args: Array[String]): Unit = {

    print("Enter first number: ")
    val a = scala.io.StdIn.readInt()

    print("Enter second number: ")
    val b = scala.io.StdIn.readInt()

    if (a > b)
      println("Largest = " + a)
    else if (b > a)
      println("Largest = " + b)
    else
      println("Both numbers are equal")
  }
}