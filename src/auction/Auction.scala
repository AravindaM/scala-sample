//package auction
//
//import scala.actors.Actor
//import java.util.Date
//
///**
// *
// *
// * By: Alexey Matveev
// * Date: 21.11.13
// * Time: 16:30
// */
//class Auction(seller: Actor, minBid: Int, closing: Date) extends Actor {
//  val timeToShutdown = 36000000 // мс
//  val bidIncrement = 10
//  def act() {
//    var maxBid = minBid - bidIncrement
//    var maxBidder: Actor = null
//    var running = true
//    while (running) {
//      receiveWithin((closing.getTime() - new Date().getTime())) {
//        case Offer(bid, client) =>
//          if (bid >= maxBid + bidIncrement) {
//            if (maxBid >= minBid) maxBidder ! BeatenOffer(bid)
//            maxBid = bid; maxBidder = client; client ! BestOffer
//          } else {
//            client ! BeatenOffer(maxBid)
//          }
//        case Inquire(client) =>
//          client ! Status(maxBid, closing)
//        case Timeout =>
//          if (maxBid >= minBid) {
//            val reply = AuctionConcluded(seller, maxBidder)
//            maxBidder !reply; seller ! reply
//          } else {
//            seller ! AuctionFailed
//          }
//          receiveWithin(timeToShutdown) {
//            case Offer(_, client) => client ! AuctionOver
//            case Timeout => running = false
//          }
//      }
//    }
//  }
//}
