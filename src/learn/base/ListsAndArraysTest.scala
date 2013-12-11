package learn.base

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/11/13
 * Time: 4:41 AM
 * To change this template use File | Settings | File Templates.
 */
object ListsAndArraysTest {

  def main(args: Array[String]) {
    val q = "hi" :: "im" :: "list" :: Nil
    println("oh" :: q)
    println(q :+ "end")

    for(
      el <- q
      if el eq "im"
    ) println("he is a list")

    val fq: List[String] = for (el <- q :+ "now") yield "|" + el + "|"
    println(fq)
  }
}
