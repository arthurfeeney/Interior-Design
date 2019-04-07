
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Interior Design Homepage")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""
"""),format.raw/*4.1*/("""<h2>Interior Design by Katie!</h2>
<div class="navbar-default">
  <a class="active" href="home" id="home">Home</a>
  <a href="news" id="news">News</a>
  <a href="contact" id="contact">Contact</a>
  <a href="about" id="about">About</a>
  <a href="gallery" id="gallery">Gallery</a>
</div>

<div id ="PageContent">
	<p>A cool "mini-gallery" and a short description goes here?</p>
</div>



""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 07 13:26:14 CDT 2019
                  SOURCE: /users/afeeney/WebApp/InteriorDesign-WebApps-S19/server/app/views/index.scala.html
                  HASH: 0f1dabfbdd119aea7a8d3e9d7aac2dcefbf8bf29
                  MATRIX: 729->1|840->19|867->21|907->53|946->55|973->56|1391->444
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|43->19
                  -- GENERATED --
              */
          