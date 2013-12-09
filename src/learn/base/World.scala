package learn.base

import java.awt.Dimension
import scala.beans.BeanProperty

/**
 *
 *
 * By: Alexey Matveev
 * Date: 04.07.13
 * Time: 12:05
 */
class World (
    @BeanProperty var name : String,
    @BeanProperty var size : java.awt.Dimension
  ) {

//  val DEFAULT : String = "Earth"

  def this() = this("Earth", null)
  def this(name:String) = this(name, null)

  def nameIt() : String = {
    if (name.eq(null)) "Earth" else name
  }

  def + (w:World): World = {
    val s1 = square(this.size)
    val s2 = square(w.size)
    val sums = s1+s2
    val midw = this.size.width + w.size.width
    val coef = (this.size.width/this.size.height+w.size.width/w.size.height)/2
    val realCoef = sums/(sums*(coef+1))
    val neww = Integer.valueOf(math.round(midw*realCoef)+"")
    val newh = Integer.valueOf(math.round(sums/neww)+"")
//    println(realCoef+" "+neww+" "+newh)
    new World("Materia", new Dimension(neww, newh));
  }

  def square(d:Dimension):Double = {
    d.getHeight*d.getWidth
  }

}