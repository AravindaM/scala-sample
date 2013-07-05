import scala.collection.mutable.ListBuffer

/**
 *
 *
 * By: Alexey Matveev
 * Date: 04.07.13
 * Time: 12:32
 */
class Cat (
  var name : String
  ) {

  var kittens : ListBuffer[Cat] = ListBuffer[Cat]()

  def this() = this("noname")

  def createKitten(name:String) {
    val kitten = new Cat(name)
    kittens.append(kitten)
    println(kittens.size)
  }

  def printKittens() {
    for (kit <- kittens.toList) {
      println("kitten "+kit)
    }
  }
}
