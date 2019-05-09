package edu.trinity.webapps.controllers
import javax.inject._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import java.util.Properties
import java.util.Date
import javax.mail.internet._
import javax.mail._
case class UserQuery(address: String, query: String)

@Singleton
class ContactController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {


  val queryForm = Form(
    mapping(
      "address" -> email,
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
   //val session = (SessionFactory() + (SmtpAddress("smtp.gmail.com", 587))).session(Some("user@gmail.com"-> "password"))
   //val prop1 = Property("mail.smtp.starttls.enable", "true")
   val postBody = request.body.asFormUrlEncoded
   //val mailer = Mailer(session)
   postBody.map {args =>
     var props = new Properties()
    
     val sender = args("address").head
     val q = args("query").head
     props.put("mail.smtp.host", "smtp.gmail.com")
     props.put("mail.smtp.port", "587")
     props.put("mail.from", sender)
     props.put("mail.smtp.starttls.enable", "true")
     val session = javax.mail.Session.getInstance(props, null)
     try {
       val msg = new MimeMessage(session)
       msg.setFrom()
       msg.setRecipients(Message.RecipientType.TO, "npatel5@trinity.edu")
       msg.setSubject("Customer Inquiry")
       msg.setSentDate(new Date())
       msg.setText(q)
       Transport.send(msg)
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
