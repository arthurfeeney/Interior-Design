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
  def home = Action { implicit request =>
    Ok(views.html.index("", request.session.get("username").getOrElse("")))
  }  
  
  def loginPage = Action { implicit request =>
    Ok(views.html.loginPage("", request.session.get("username").getOrElse("")))
  }

   // login with an existing account.
  def loginUser(name:String, pw:String) = Action async { implicit request =>
    val id = Await.result(models.UserModel.checkPassword(name, pw, db), Duration.Inf)
    println(id)
    if(!id.isEmpty) {
      println("Current user: " + name)
      Future{Redirect(routes.SiteController.home).
        withSession("username" -> name)}
    }
    else {
      println("login " + name + " failed.")
      Future.successful(Redirect(routes.Application.index).withNewSession)
    }
  }
  
  def logout() = Action async { implicit request =>
    Future.successful(Redirect(routes.Application.index).withNewSession)
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
      println("New User " + name)
      models.UserModel.addUser(name, pw, db)
      Future.successful(Redirect(routes.Application.index).
        withSession("username" -> name))
    }
  }
  
  
  def gallery = Action {
    Ok(views.html.anotherGallery())
  }


  def contact = Action {implicit request =>
    Redirect(routes.ContactController.contactHome).withSession("username" -> request.session("username"))
  }
  

  // go to news page
  def news = Action { implicit request =>
    Ok(views.html.news(request.session.get("username").getOrElse("")))
  }

  
  // go to the "about" page
  def about = Action { implicit request =>
    Ok(views.html.about(request.session.get("username").getOrElse("")))
  }
  
  // go to the logged-in user's receipt page.
  def receipt = Action.async { implicit request => 
    val name = request.session.get("username")
    println(name)
    val clientList = Await.result(models.UserModel.clientList(db), Duration.Inf)
    models.ReceiptDataModel
      .getReceiptsForUser(name.getOrElse(""), db)
      .map(x => x.map(y => Seq(y.item.toString, y.price.toString, y.description.getOrElse(""), y.vendorid.toString)))
      .map(s => Ok(views.html.receipt(name, name, s, clientList)))
  }
  
  def viewReceipt(clientToView: String) = Action.async { implicit request =>
    val name = request.session.get("username")
    val clientList = Await.result(models.UserModel.clientList(db), Duration.Inf)
    models.ReceiptDataModel
      .getReceiptsForUser(clientToView, db)
      .map(x => x.map(y => Seq(y.item.toString, y.price.toString, y.description.getOrElse(""), y.vendorid.toString)))
      .map(s => Ok(views.html.receipt(name, Some(clientToView), s, clientList)))
  }
  
}
