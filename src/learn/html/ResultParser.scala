package learn.html

import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 7/6/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
object ResultParser {

  val fileIn = new File("..\\..\\result.txt")
  val fileOut = new File("..\\..\\result_phase2.txt")

  def main(args: Array[String]) {
    val lines: Iterator[String] = io.Source.fromFile("", "UTF-8").getLines
    while (lines.hasNext) {

    }
  }

//  def readLines(iterator : Iterator[String]) :  = {}
}
