import util.PrintUtils

/**
 *
 *
 * By: Alexey Matveev
 * Date: 06.07.13
 * Time: 12:40
 */
object SortRunner {
  def main(args: Array[String]) {
    var sortObj = new QuickSort
    var list = Array(1,34,73,1,5,8,45,23,87,23,6,3)
    var funcSortedList = sortObj.functSort(list)
    (new PrintUtils).printArray(funcSortedList)
    sortObj.ooSort(list)
    println()
    (new PrintUtils).printArray(list)
  }
}
