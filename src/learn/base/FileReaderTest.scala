package learn.base

import scala.io.Source

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/10/13
 * Time: 1:59 AM
 * To change this template use File | Settings | File Templates.
 */
object FileReaderTest {

  def main(args: Array[String]) {
    val file = Source.fromFile("C:\\dev\\workspace\\scala-sample\\src\\learn\\base\\file_to_read")
    val lines = file.getLines().map(x => 1).sum
    println(lines)
  }
}
