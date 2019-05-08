

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

@Singleton
class GalleryController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider,
    cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc)
    with HasDatabaseConfigProvider[JdbcProfile]{
  
  def filterByDesc(desc: String) = Action.async { implicit request =>
    val postBody = request.body.asFormUrlEncoded
    postBody.map { args =>
      try {
        
        //val desc = args("newName").head.toString
        //models.ImageDataModel.getByDesc(desc, db);
        val dataFut = models.ImageDataModel.getByDesc(desc, db)
        //Ok(views.html.loginPage())
        //Ok(views.html.anotherGallery())
        dataFut.map(tsk => Ok(views.html.anotherGallery(mutable.ArrayBuffer(tsk : _*))))
        
          
        
      } catch {
        case ex: NumberFormatException => Future.successful(Redirect("index", 200))
      }
    }.getOrElse(Future.successful(Redirect("index", 200)))
  }
  
  
  
}