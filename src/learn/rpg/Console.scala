package learn.rpg

/**
 *
 *
 * By: Alexey Matveev
 * Date: 25.12.13
 * Time: 14:33
 */
object Console {

  def read(): String = readLine()

  def write(msg: String) = println(msg)

  def delimiter() = println("##############################")

  def round(msg: String) {
    delimiter()
    println("##   " + msg + "   ##")
    delimiter()
  }

}
