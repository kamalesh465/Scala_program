object FunctionExample {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {

    print("Enter first number: ")
    val a = scala.io.StdIn.readInt()

    print("Enter second number: ")
    val b = scala.io.StdIn.readInt()

    val result = add(a, b)

    println("Sum = " + result)
  }
}