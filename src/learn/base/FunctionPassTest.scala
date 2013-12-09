package learn.base

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/10/13
 * Time: 12:36 AM
 * To change this template use File | Settings | File Templates.
 */
object FunctionPassTest {

  def main(args: Array[String]) {
    class Spoon(length: Int) {
      def checkFit(check: (Int) => Boolean) = check(length)
    }
    class Box(width: Int, height: Int) {
      def boxCheck(length: Int): Boolean = width > length || height > length
    }
    val shortSpoon = new Spoon(5)
    val longSpoon = new Spoon(15)
    val box = new Box(10,10)

    println(shortSpoon checkFit box.boxCheck)
    println(longSpoon checkFit box.boxCheck)

    val arr = List(1,2,3)
    arr.foreach(println)

    // while imitation
    def whil(c: => Boolean)(b: => Unit): Unit = {
      if (c) {
        b
        whil(c)(b)
      }
    }
    var i = 0;
    whil {
      i+= 1
      i < 5
    } (print(i))
  }

}
