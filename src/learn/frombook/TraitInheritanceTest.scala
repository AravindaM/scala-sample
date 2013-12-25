package learn.frombook

/**
 *
 *
 * By: Alexey Matveev
 * Date: 19.12.13
 * Time: 12:18
 */
object TraitInheritanceTest {
  def main(args: Array[String]) {
    val places: UpdatableSkatingPlaces = new UpdatableSkatingPlaces()
    print(places.howDoYouDoClass)
    print(places.findAt(2))
  }
}


trait ReadOnly[T] {
  val collection: List[T]
  def size = collection.size
  def findAt(pos: Int) = collection(pos)
  def howDoYouDoClass: String
}

trait Updatable[T] extends ReadOnly[T] {
  def add(el: T) = collection :+ el
  override def howDoYouDoClass = "I'm updatable and i'm fine"
}

class SkatingPlaces extends ReadOnly[String] {
  val collection: List[String] = List(
    "Primorsky pr.",
    "Navereznaya VO",
    "Home sweet home",
    "Elagin ves")
  override def howDoYouDoClass = "Well I'm pretty sure that u're testing the DD problem"
}

class UpdatableSkatingPlaces extends SkatingPlaces with Updatable[String]