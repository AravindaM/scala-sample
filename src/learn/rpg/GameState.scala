package learn.rpg

import scala.collection.immutable.Stack
/**
 *
 *
 * By: Alexey Matveev
 * Date: 25.12.13
 * Time: 14:03
 */
class GameState {

  var char1 = Character.default
  var char2 = Character.default
  val states: Stack[State] = Stack.empty[State]

  def nextState: State = states.pop.top
  def state: State = states.top

  class State extends Enumeration {
    val START = Value("start")
    val GAME = Value("game")
    val END = Value("end")
  }
}
