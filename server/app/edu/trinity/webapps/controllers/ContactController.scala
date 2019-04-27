package edu.trinity.webapps.controllers
import javax.inject._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import com.github.jurajburian.mailer._
import javax.mail.internet.InternetAddress
case class UserQuery(address: String, query: String)

@Singleton
class ContactController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  val session = (SessionFactory() + (SmtpAddress("smtp.gmail.com", 587))).session()

  val queryForm = Form(
    mapping(
      "address" -> email,
      "query" -> text
    )(UserQuery.apply)(UserQuery.unapply)
  )
 def contact = Action { implicit request =>
    Ok(views.html.about())

  }
}

//  def postQuery = Action {implicit request =>
//    val postBody = request.body.asFormUrlEncoded
//    val mailer = Mailer(session)
//    postBody.map {args =>
//      val sender = args("address").head
//      val q = args("query").head
//      val content = new Content().text(q)
//      val msg = Message(
//          from = new InternetAddress(sender),
//          subject = "Customer Inquiry",
//          content = content,
//          to = Seq(new InternetAddress("npatel5@trinity.edu"))
//          )
//      try {
//        mailer.send(msg)
//        //Redirect(routes.ContactController.contact()).withNewSession
//      }
//      catch {
//        //case ex: javax.mail.MessagingException => Redirect(routes.ContactController.contact())
//      }
//    }.getOrElse(Redirect(routes.ContactController.contact()))
//  }
