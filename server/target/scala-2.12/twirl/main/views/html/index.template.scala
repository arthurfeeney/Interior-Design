
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
"""),_display_(/*3.2*/main("Play with Scala.js")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
"""),format.raw/*4.1*/("""<h2>Play and Scala.js share a same message</h2>
<div class="topnav">
  <a class="active" href="#home" id="home">Home</a>
  <a href="#news" id="news">News</a>
  <a href="#contact" id="contact">Contact</a>
  <a href="#about" id="about">About</a>
</div>

<div id ="PageContent"></div>



""")))}),format.raw/*16.2*/("""
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
<<<<<<< HEAD
                  DATE: Fri Apr 05 14:35:30 CDT 2019
                  SOURCE: /users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/app/views/index.scala.html
=======
                  DATE: Fri Apr 05 11:46:06 CDT 2019
                  SOURCE: /Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/app/views/index.scala.html
>>>>>>> 3bc42ee90cb7e43490fad41ef175919f2492d7ac
                  HASH: b15b5e6a65cd6869cbccd1bdadcd41e0eb1e3460
                  MATRIX: 729->1|840->19|867->21|901->47|940->49|967->50|1283->336
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|40->16
                  -- GENERATED --
              */
          