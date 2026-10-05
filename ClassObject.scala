class Student {
  val name = "Kamalesh"
  val age = 20

  def display(): Unit = {
    println("Name = " + name)
    println("Age = " + age)
  }
}

object ClassObject {
  def main(args: Array[String]): Unit = {

    val s = new Student()

    s.display()
  }
}