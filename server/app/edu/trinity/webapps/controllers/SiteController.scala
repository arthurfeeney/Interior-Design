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


@Singleton
class SiteController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider,
    cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc)
    with HasDatabaseConfigProvider[JdbcProfile]{

  // go to the login (home/index) page.
  def login = Action { implicit request =>
    Ok(views.html.index("hi"))
  }  
  

   // login with an existing account.
  def loginUser(name:String, pw:String) = Action async { implicit request =>
    val id = Await.result(models.UserModel.checkPassword(name, pw, db), Duration.Inf)
    println(id)
    if(!id.isEmpty) {
      Future{Redirect(routes.Application.index).
        withSession("username" -> name)}
    }
    else {
      println("login failed.")
      Future.successful(Redirect(routes.Application.index).withNewSession)
    }
  }

  
  // create a new account
  def addUser(name:String, pw:String) = Action async { implicit request =>
    // check if the name is already taken or is invalid -- Don't create account!
    val id = Await.result(models.UserModel.checkPassword(name, pw, db), Duration.Inf)
    if(!id.isEmpty || name == "" || pw == "") {
      println("Invalid name/password (taken or empty string)")
      Future.successful(Redirect(routes.Application.index).withNewSession)
    }
    else {
      println("adding user")
      models.UserModel.addUser(name, pw, db)
      Future.successful(Redirect(routes.Application.index).
        withSession("username" -> name))
    }
  }
  
  
  def gallery = Action {
    Ok(views.html.gallery())
  }


  def postQuery = Action {implicit request =>
    Redirect(routes.ContactController.contact).withNewSession
  }


  // go to news page
  def news = Action { implicit request =>
    Ok(views.html.news())
  }

  
  // go to the "about" page
  def about = Action { implicit request =>
    Ok(views.html.about())
  }
  
  def receipt = Action.async { implicit request => 
    val name = request.session.get("username")
    println(name)
    models.ReceiptDataModel
      .getReceiptsForUser(name.getOrElse(""), db)
      .map(x => x.map(y => Seq((y.item, y.price, y.description).toString)))
      .map(s => Ok(views.html.receipt(name, s)))
  }
  
  
}
