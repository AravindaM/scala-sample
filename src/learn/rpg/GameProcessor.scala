package learn.rpg

import learn.rpg.GameState._
/**
 *
 *
 * By: Alexey Matveev
 * Date: 25.12.13
 * Time: 14:45
 */
object GameProcessor {

  def startPlaying(): Unit = {
    val game: GameState = createGame()
    processState(game.state)

  }

  def processState(state: State) = {

  }

  def createGame(): GameState = {
    val gameState: GameState = new GameState()
    gameState.states.push(learn.rpg.GameState.State)
    gameState
  }
}
