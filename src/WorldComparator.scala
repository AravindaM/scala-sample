import java.awt.Dimension

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 15:15
 */
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
