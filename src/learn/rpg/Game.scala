package learn.rpg

/**
 *
 *
 * By: Alexey Matveev
 * Date: 25.12.13
 * Time: 14:38
 */
object Game {

  val version = 0.1

  def main(args: Array[String]) {
    Console.round("SimpleRPG " + version)
    GameProcessor.startPlaying()
    Console.delimiter()
    Console.write("Thanks for playing")
  }

}
