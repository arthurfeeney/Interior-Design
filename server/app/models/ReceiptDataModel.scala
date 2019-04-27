package models
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext
case class Receipt(userID: Int, receiptID: Int, vendorID: Int, item: String, description: String)

object ReceiptDataModel {

}
