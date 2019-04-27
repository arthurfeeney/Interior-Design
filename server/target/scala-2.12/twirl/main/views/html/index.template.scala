
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
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Interior Design Homepage")/*4.34*/ {_display_(Seq[Any](format.raw/*4.36*/("""
"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.versioned("stylesheets/main.css")),format.raw/*5.93*/("""">

<h2>Interior Design by Katie!</h2>
<div class="navbar-default">
  <a class="active" href="home" id="home">Home</a>
  <a href="news" id="news">News</a>
  <a href="contact" id="contact">Contact</a>
  <a href="about" id="about">About</a>
  <a href="gallery" id="gallery">Gallery</a>
</div>

<div id="PageContent">
	<p > A cool "mini-gallery" and a short description goes here?</p>
</div>


<form action="loginUser" method="GET">
	<span>username: </span><input type="text" name="name"></input>
	</br>
	<span>password: </span>	<input type="text" name="pw"></input>
	</br>
	<input type="submit" 	value="login" name="login"></input>
</form>

<p> Hello, create an account here </p>
<form action="addUser" method="GET">
		<input type="text" name="name"></input>
		<input type="text" name="pw"></input>
		<input type="submit" value="create" name="createAccount"></input>
</form>



""")))}),format.raw/*38.2*/("""
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
                  DATE: Sat Apr 27 12:03:24 CDT 2019
                  SOURCE: /Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/app/views/index.scala.html
                  HASH: 2a566e3904db241bdbc80076f31a5a7c0bcce130
                  MATRIX: 729->2|840->20|867->22|907->54|946->56|973->57|1044->102|1058->108|1119->149|2026->1026
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|28->5|28->5|28->5|61->38
                  -- GENERATED --
              */
          