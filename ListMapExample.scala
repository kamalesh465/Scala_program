object ListMapExample {
  def main(args: Array[String]): Unit = {

    val numbers = List(10, 20, 30, 40, 50)

    println("List elements:")

    numbers.foreach(n => println(n))

    val students = Map(
      1 -> "Arun",
      2 -> "Bala",
      3 -> "Kumar"
    )

    println("Map elements:")

    students.foreach {
      case (key, value) => println(key + " -> " + value)
    }
  }
}