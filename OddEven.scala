object OddEven {
  def main(args: Array[String]): Unit = {

    print("Enter a number: ")
    val n = scala.io.StdIn.readInt()

    if (n % 2 == 0)
      println("Even")
    else
      println("Odd")
  }
}