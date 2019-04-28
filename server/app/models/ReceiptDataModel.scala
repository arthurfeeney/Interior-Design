package models
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext
//case class Receipt(userID: Int, receiptID: Int, vendorID: Int, item: String, description: String)

object ReceiptDataModel {
  def addReceipt(db: Database, uID: Int, rID: Int, vID: Int, price: Float, item: String, desc: String)(implicit ec: ExecutionContext): Unit = {
    Await.result(db.run(Receipt+=ReceiptRow(uID, rID, vID, Some(price), Some(item), Some(desc))), Duration.Inf)
  }
  
  def getReceiptsForUser(userID: Int, db: Database)(implicit ec: ExecutionContext):Future[Seq[ReceiptRow]] = {
    db.run {
      val receipts = for {
        r <- Receipt
        if r.userid === userID
      }
      yield {r}
      receipts.result
    }
  }
  
  def getReceiptForVendor(vendorID: Int, db:Database)(implicit ec: ExecutionContext): Future[Seq[ReceiptRow]] = {
    db.run {
      val receipts = for {
        r <- Receipt
        if r.vendorid === vendorID
      }
      yield {r}
      receipts.result
    }
  }
}
   
  

