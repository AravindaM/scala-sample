package learn.rpg

/**
 *
 *
 * By: Alexey Matveev
 * Date: 25.12.13
 * Time: 13:47
 */
class Character(var hp: Int, var minAtt: Int, var maxAtt: Int, var deff: Int) {

}

object Character {
  def default: Character = new Character(15, 1, 3, 4)
}
