package org.test.pcg

class FirstClass (a: Int) {

  def printVal(): Unit = println(s"value of a=$a")
  override def toString(): String = s"value of a=$a"
}

object FirstClass {
  def apply(a: Int): FirstClass = new FirstClass(a)
}
