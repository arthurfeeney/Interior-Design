package edu.trinity.webapps.controllers

import javax.inject._

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

case class UserQuery(address: String, query: String)

@Singleton
class SiteController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  def login = Action { implicit request =>
    Ok(views.html.index("hi"))
  }
  
  def loginUser(name:String, pw:String) = Action { implicit request =>
    if(models.UserModel.checkPassword(name, pw)) {
      Redirect(routes.SiteController.contact).
        withSession("username" -> name)
    }
    else {
      Redirect(routes.Application.index).withNewSession    
    }
  }
  
  def addUser(name:String, pw:String) = Action { implicit request =>
    // check if the name is already taken or is invalid -- Don't create account!
    if(models.UserModel.checkName(name) || name == "" || pw == "") {
      println("Invalid name/password (taken or empty string)")
      Redirect(routes.SiteController.contact).withNewSession
    }
    else {
      models.UserModel.addUser(name, pw)
      Redirect(routes.SiteController.contact).
        withSession("username" -> name)
    }
  }
  
  
  val queryForm = Form(
    mapping(
      "address" -> email,
      "query" -> text
    )(UserQuery.apply)(UserQuery.unapply)
  )

  def contact = Action { implicit request =>
    Ok(views.html.contact(queryForm))
  }

  def gallery = Action {
    Ok(views.html.gallery())
  }
    
  def postQuery = Action {implicit request =>
    Redirect(routes.SiteController.contact).withNewSession
  }

  // go to news page
  def news = Action { implicit request =>
    Ok(views.html.news())
  }
  
  // go to the "about" page
  def about = Action { implicit request =>
    Ok(views.html.about())
  }
}
