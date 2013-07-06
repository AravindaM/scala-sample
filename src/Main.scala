import java.awt.Dimension

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 13:06
 */
object Main {
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
}
