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
    Await.result(db.run(Vendor+=VendorRow(id=9,Some(vname), Some(phone), Some(email), Some(st), Some(city), Some(state), Some(zip))),Duration.Inf)
  }
}