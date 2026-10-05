object AddNumbers {
  def main(args: Array[String]): Unit = {

    print("Enter first number: ")
    val a = scala.io.StdIn.readInt()

    print("Enter second number: ")
    val b = scala.io.StdIn.readInt()

    val sum = a + b

    println("Sum = " + sum)
  }
}