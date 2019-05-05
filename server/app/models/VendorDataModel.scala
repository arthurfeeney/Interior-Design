package models
import slick.jdbc.MySQLProfile.api._
import scala.concurrent.duration.Duration
import scala.concurrent.Await
import scala.concurrent.Future
import Tables._
import scala.concurrent.ExecutionContext
//case class Vendor(vendorID: Int, vendorName: String, phone: Int, email: String,
//                  street: String, city: String, state: String, zip: String)
object VendorDataModel {
  def addVendor(db: Database, vname: String, phone: Int, email: String, st: String, city: String, state: String, zip: String)(implicit ec: ExecutionContext): Unit = {
    Await.result(db.run(Vendor+=VendorRow(0,Some(vname), Some(phone), Some(email), Some(st), Some(city), Some(state), Some(zip))),Duration.Inf)
  }
  
  def addVendor(db: Database, vname: String)(implicit ec: ExecutionContext): Unit = {
    // simple insert. For many things, many things besides name is unnecessary.
    Await.result(db.run(Vendor+=VendorRow(0, Some(vname), None, None, None, None, None, None)), Duration.Inf)
  }
  
  def removeVendor(vid: Int, db: Database): Unit = {
    val v = Vendor.filter(_.id === vid)
    Await.result(db.run(v.delete), Duration.Inf)
  }
  
  def checkVendor(vname: String, db: Database): Future[Option[Int]] = {
    // returns vendor's id if its exists in the database.
    db.run {
      val ids = for {
        v <- Vendor
        if v.name === vname
      }
      yield {v.id}
      ids.result.headOption
    }
  }
}