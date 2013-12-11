/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 12/11/13
 * Time: 5:12 AM
 * To change this template use File | Settings | File Templates.
 */
case class Cool()
case class NotCool()

def checkCool(c: Any): String = c match {
  case a: Cool => "it's cool"
  case a: NotCool => "it's not cool"
  case _ => "dont know"
}

val firstArg: String = args(0)
println(s"args(0) is $firstArg")

val c = firstArg match {
  case "cool" => new Cool
  case "notcool" => new NotCool
  case _ => Unit
}
println(s"c is of type $c")

val cool: String = checkCool(c)
println(cool)