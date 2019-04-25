package edu.trinity.webapps.controllers

import javax.inject._

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

case class UserQuery(address: String, query: String)

@Singleton
class SiteController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  val queryForm = Form(
    mapping(
      "address" -> email,
      "query" -> text
    )(UserQuery.apply)(UserQuery.unapply)
  )

  def contact = Action { implicit request =>
    Ok(views.html.contact(queryForm))
  }

//<<<<<<< HEAD
  def gallery = Action {
    Ok(views.html.anotherGallery())
  }
    

//=======
  def postQuery = Action {implicit request =>
    Redirect(routes.SiteController.contact).withNewSession
  }
//>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac
  
  // go to news page
  def news = Action { implicit request =>
    Ok(views.html.news())
  }
  
  // go to the "about" page
  def about = Action { implicit request =>
    Ok(views.html.about())
  }
}
