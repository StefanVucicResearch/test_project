import org.test.pcg.FirstClass

object TestMain {

  def main(args: Array[String]): Unit = {
    println("Hello world")

    println("\nNext is print of first object")
    val nc = new FirstClass(45)
    nc.printVal()

    val n = FirstClass(721)
    println(s"\nThis is value for second object:\n" + n.toString)

    println("test")

    println("local testing")

    println("new_cahanges branch: new local")



  }

}
