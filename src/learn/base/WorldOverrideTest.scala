package learn.base

import java.awt.Dimension

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 13:06
 */
object WorldOverrideTest {
  def main(args: Array[String]) {
    val earth = new World
    earth.size = new Dimension(100,20)
    val mars = new World("Mars")
    mars.size = new Dimension(50,10)
    val jupiter = new World("Jupiter")
    jupiter.size = new Dimension(150,150)

    val combined = earth+mars

    val wc = new WorldComparator
    wc.compare(combined,earth)
  }

  class WorldComparator {
    def compare(w1:World, w2:World) {
      if (square(w1.getSize)>square(w2.getSize)) result(w2,w1)
      else result(w1,w2)
    }

    def square(d:Dimension):Double = {
      d.getHeight*d.getWidth
    }

    def result(smaller:World, bigger:World) {
      println(smaller.name+" is "+square(smaller.size)+" and "+bigger.name+" is "+square(bigger.size))
      println(bigger.getName+" is bigger than "+smaller.getName)
    }
  }
}
