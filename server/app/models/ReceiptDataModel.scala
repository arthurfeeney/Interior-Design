package models
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext

object ReceiptDataModel {
  def addReceipt(db: Database, uID: Int, vID: Int, price: Float, item: String, desc: String)(implicit ec: ExecutionContext): Unit = {
    Await.result(db.run(Receipt+=ReceiptRow(0, uID, vID, price, Some(item), desc)), Duration.Inf)
  }
  
  def removeReceipt(rid: Int, db: Database)(implicit ec: ExecutionContext): Unit = {
    val r = Receipt.filter(_.id === rid)
    Await.result(db.run(r.delete), Duration.Inf)
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
  
  def getReceiptsForUser(userID: String, db: Database)(implicit ec: ExecutionContext):Future[Seq[ReceiptRow]] = {
    db.run {
      val receipts = for {
        (r, u) <- Receipt join User on (_.userid === _.id)
        if u.username === userID
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
   
  

