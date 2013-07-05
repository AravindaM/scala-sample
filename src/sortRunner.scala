import util.PrintUtils

/**
 *
 *
 * By: Alexey Matveev
 * Date: 05.07.13
 * Time: 18:08
 */
var sort = new QuickSort
var list = Array(1,4,8,3,4,6,2,12,63,43,2,6)
sort.ooSort(list)
(new PrintUtils).printArray(list)
