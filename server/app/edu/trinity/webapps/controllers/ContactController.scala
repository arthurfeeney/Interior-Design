package edu.trinity.webapps.controllers
import javax.inject._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import javax.mail.internet._

import com.github.jurajburian.mailer._
case class UserQuery(query: String)

@Singleton
class ContactController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {


  val queryForm = Form(
    mapping(
      "query" -> text
    )(UserQuery.apply)(UserQuery.unapply)
  )
  
 def contactHome = Action { implicit request =>
    request.session("username").nonEmpty match {
      case true => Ok(views.html.contact(queryForm, None))
      case false => Ok(views.html.contact(queryForm, Some(request.session("username"))))
    }

  }
  
  


  def postQuery = Action {implicit request =>
   println("Sending email from user "+request.session("username"))
   val session = (SessionFactory() + (SmtpAddress("smtp.gmail.com", 587)) + Property("mail.smtp.starttls.enable", "true")).session(Some("interiordesign3345@gmail.com"-> "WebApps3345"))
   //val prop1 = Property("mail.smtp.starttls.enable", "true")
   val postBody = request.body.asFormUrlEncoded
   val mailer = Mailer(session)
   postBody.map {args =>
     val q = args("query").head
     val content = new Content().text(q)
     val sender = new InternetAddress("interiordesign3345@gmail.com")
     val receiver = new InternetAddress("npatel5@trinity.edu")
     val msg = Message(
         from = sender,
         subject = "Customer Inquiry from"+request.session("username"),
         content = content,
         to = Seq(receiver))
         
     try {
       mailer.send(msg)
       println("Message sent!")
       
       Redirect(routes.ContactController.contactHome)
          

     }
     catch {
       case ex: javax.mail.MessagingException => {
         println(ex.toString())
         ex.printStackTrace()
         println("Sending failed")
         Redirect(routes.ContactController.contactHome)
       }
     }
   }.getOrElse(Redirect(routes.ContactController.contactHome))
  }
}
