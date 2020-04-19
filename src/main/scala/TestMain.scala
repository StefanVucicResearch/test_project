import org.test.pcg.FirstClass

object TestMain {

  def main(args: Array[String]): Unit = {
    println("Hello world")

    println("Next is print of new class")
    val nc = new FirstClass(45)
    nc.printVal()

    println("Print for new branch")

  }

}
