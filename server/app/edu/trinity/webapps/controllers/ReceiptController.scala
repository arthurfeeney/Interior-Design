package edu.trinity.webapps.controllers

import javax.inject._

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import scala.concurrent._
import scala.concurrent.duration.Duration
import models._

import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import scala.concurrent.ExecutionContext

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.Await

@Singleton
class ReceiptController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider,
    cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc)
    with HasDatabaseConfigProvider[JdbcProfile]{

    // admin adds an item to a user's receipt.
    def addItem(clientName: String, itemName: String, price:String, desc:String, vendor: String) = Action.async { implicit request =>
      val cid = Await.result(models.UserModel.checkName(clientName, db), Duration.Inf)
      if(cid.isEmpty) {
        // adding receipt failed.
        println("ReceiptController.addItem: customer does not exist.")
        Future.successful(Redirect(routes.Application.index).withNewSession)
      }
      else {
        val vid = Await.result(models.VendorDataModel.checkVendor(vendor, db), Duration.Inf)
        if(vid.isEmpty) {
          // if the vendor doesn't exist, create a new thing with just the name.
          models.VendorDataModel.addVendor(db, vendor)
          val newVid = Await.result(models.VendorDataModel.checkVendor(vendor, db), Duration.Inf)
          models.ReceiptDataModel.addReceipt(db, cid.get, newVid.get, price.toFloat, itemName, desc)
          Future{Redirect(routes.SiteController.viewReceipt(clientName)).
            withSession("username" -> request.session.get("username").get)}
        }
        else {
          models.ReceiptDataModel.addReceipt(db, cid.get, vid.get, price.toFloat, itemName, desc)
          Future{Redirect(routes.SiteController.viewReceipt(clientName)).
            withSession("username" -> request.session.get("username").get)}
        }
        
      }
    }
  
}
