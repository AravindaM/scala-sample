package learn.base

import scala.language.dynamics
/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/10/13
 * Time: 2:11 AM
 * To change this template use File | Settings | File Templates.
 */
object DynamicTest {

  def main(args: Array[String]) {
    class DynamicPrint extends Dynamic {
      def selectDynamic(text: String): DynamicPrint = {
        println(text)
        this
      }
    }
    val printer = new DynamicPrint
    printer.hell.thisis.a_dynamic_print.and.thisis.awesome
  }
}
