package learn.base

/**
 *
 *
 * By: Alexey Matveev
 * Date: 04.07.13
 * Time: 12:05
 */
object CatCreatorTest {
  def main(args: Array[String]) {
    println("hello")
    def cat = new Cat
    cat.createKitten("pussycat")
    cat.createKitten("newKitten")
    cat.printKittens()
  }
}
