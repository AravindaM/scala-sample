package learn.solution

/**
 * Sorting runner.
 * Functional and OOP sorting.
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 12:40
 */
object SortRunner {
  def main(args: Array[String]) {
    val list = Array(1,34,73,1,5,8,45,23,87,23,6,3)
    functSort(list).foreach(print)
    println()
    ooSort(list); list.foreach(print)
  }

  /**
   * Modifies the list.
   * @param xs
   */
  def ooSort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val t = xs(i); xs(i) = xs(j); xs(j) = t
    }
    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l; var j = r
      while (i <= j) {
        while (xs(i) < pivot) i += 1
        while (xs(j) > pivot) j -= 1
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) sort1(l, j)
      if (j < r) sort1(i, r)
    }
    sort1(0, xs.length - 1)
  }

  /**
   * Sorting list is immutable.
   * @param xs
   * @return
   */
  def functSort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        functSort(xs filter (pivot >)),
        xs filter (pivot ==),
        functSort(xs filter (pivot <)))
    }
  }

}
