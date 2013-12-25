package learn.base

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/10/13
 * Time: 1:56 AM
 * To change this template use File | Settings | File Templates.
 */
object FeaturesTest {

  def main(args: Array[String]) {
    // function literal underscore synonym
    val name="lexx"
    println(name.exists(_.isUpper))
    // string interpolation
    println(s"my name is $name")
  }

}