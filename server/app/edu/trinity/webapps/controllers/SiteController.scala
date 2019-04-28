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
class SiteController @Inject()(protected val dbConfigProvider: DatabaseConfigProvider,
    cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc)
    with HasDatabaseConfigProvider[JdbcProfile]{

//<<<<<<< HEAD
  def login = Action { implicit request =>
    Ok(views.html.index("hi"))
  }

  def loginUser(name:String, pw:String) = Action async { implicit request =>
    val id = Await.result(models.UserModel.checkPassword(name, pw, db), Duration.Inf)
    if(!id.isEmpty) {
      Future{Redirect(routes.ContactController.contact).
        withSession("username" -> name)}
    }
    else {
      Future.successful(Redirect(routes.Application.index).withNewSession)
    }
  }

  def addUser(name:String, pw:String) = Action async { implicit request =>
    // check if the name is already taken or is invalid -- Don't create account!
    val id = Await.result(models.UserModel.checkPassword(name, pw, db), Duration.Inf)
    if(!id.isEmpty || name == "" || pw == "") {
      println("Invalid name/password (taken or empty string)")
      Future.successful(Redirect(routes.ContactController.contact).withNewSession)
    }
    else {
      models.UserModel.addUser(name, pw, db)
      Future.successful(Redirect(routes.ContactController.contact).
        withSession("username" -> name))
    }
  }
//=======
//>>>>>>> bc1119f876dfa4eca005225b84216ea09e8daa08


  def gallery = Action {
    Ok(views.html.gallery())
  }

//<<<<<<< HEAD
  def postQuery = Action {implicit request =>
    Redirect(routes.ContactController.contact).withNewSession
  }

//=======

//=======

//>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac

//>>>>>>> bc1119f876dfa4eca005225b84216ea09e8daa08
  // go to news page
  def news = Action { implicit request =>
    Ok(views.html.news())
  }

  // go to the "about" page
  def about = Action { implicit request =>
    Ok(views.html.about())
  }
}
