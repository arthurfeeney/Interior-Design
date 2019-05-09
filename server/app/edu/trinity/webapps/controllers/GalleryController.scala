

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
import scala.util.{Failure, Success}

import collection.mutable

import play.api.libs.json._
import play.api.libs.functional.syntax._

 case class ImageRow(id: Int, imglink: String, description: String, colnum: Int, rownum: Int)
  
 
@Singleton
class GalleryController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider,
    cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc)
    with HasDatabaseConfigProvider[JdbcProfile]{
  
  
  implicit def optionFormat[T: Format]: Format[Option[T]] = new Format[Option[T]]{
    override def reads(json: JsValue): JsResult[Option[T]] = json.validateOpt[T]

    override def writes(o: Option[T]): JsValue = o match {
      case Some(t) ⇒ implicitly[Writes[T]].writes(t)
      case None ⇒ JsNull
    }
  }
  
   implicit val imageRowWrites: Writes[models.Tables.ImageRow] = (
    (JsPath \ "id").write[Int] and
    (JsPath \ "imglink").write[String] and
    (JsPath \ "description").write[String] and
    (JsPath \ "colnum").write[Int] and
    (JsPath \ "rownum").write[Int])(unlift(models.Tables.ImageRow.unapply))

 
  
  def filterByDesc(desc: String) = Action.async { implicit request =>

        val dataFut = models.ImageDataModel.getByDesc(desc, db)
        //Ok(views.html.loginPage())
        //Ok(views.html.anotherGallery())
        println("Filtering")
        dataFut.map(tsk => println(Json.toJson(tsk.toString())))
        dataFut.map(tsk => Ok(Json.toJson(tsk.map(_.imglink))))

  }
   def loadGallery() = Action.async { implicit request =>
     val dataFut = models.ImageDataModel.images(db)
     //dataFut.map(tsk => Ok(Json.toJson(tsk.map(_.imglink))))
     dataFut.map(data => Ok(Json.toJson(data)))
   }
  
  
  
}