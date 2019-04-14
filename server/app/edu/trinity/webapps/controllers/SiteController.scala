package edu.trinity.webapps.controllers

import javax.inject._

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


@Singleton
class SiteController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {



//<<<<<<< HEAD
  def gallery = Action {
    Ok(views.html.gallery())
  }
    

//=======

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
