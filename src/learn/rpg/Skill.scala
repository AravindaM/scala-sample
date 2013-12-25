//package learn.rpg
//
///**
// *
// *
// * By: Alexey Matveev
// * Date: 25.12.13
// * Time: 13:49
// */
//class Skill {
//
//  var skillType: SkillType
//  var cooldown: Int
//
//  class SkillType extends Enumeration {
//    type Skill = Value
//    val DEFENDER = Value("def", 2)
//    val ASSASSIN = Value("ass", 3)
//    case class Defender() extends Apply {
//      override def apply(game: GameState) {
//        val char: Character = game.getCurrent()
//        char.deff = char.deff + 2
//        char.skill.cooldown = 2
//      }
//    }
//    case class Assassin() extends Apply {
//      override def apply(game: GameState) {
//        val char: Character = game.getCurrent()
//        char.max = char.deff + 2
//        char.skill.cooldown = 2
//      }
//    }
//    class MyVal(name: String, val cooldown: Int) extends Val(nextId, name)
//    protected final def Value(name: String, cooldown: Int): MyVal = new MyVal(name, cooldown)
//    trait Apply {
//      def apply(game: GameState)
//    }
//  }
//
//}
