import org.test.pcg.FirstClass

object TestMain {

  def main(args: Array[String]): Unit = {
    println("Hello world")

    println("Next is print of new class")
    val nc = new FirstClass(45)
    nc.printVal()


    println("One more println")

    println("One more println in a row for pull request")

    val n = FirstClass(721)
    println(s"This is value for new instance:\n" + n.toString)



  }

}
