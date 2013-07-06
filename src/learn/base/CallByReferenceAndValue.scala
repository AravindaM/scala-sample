package learn.base

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 20:13
 */
object CallByReferenceAndValue {
  def main(args: Array[String]) {
    callLoop(loop)
    callLoop(loop,2)
  }

  def callLoop(y: => Int) = {
    println("noloop")
  }

  def callLoop(x: Int, y: => Int) = {
    println("loophere")
    println(x)
  }

  def loop: Int = loop
}
