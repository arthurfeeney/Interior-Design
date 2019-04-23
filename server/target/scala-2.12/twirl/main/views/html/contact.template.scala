
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[_$1] forSome { 
   type _$1
},Option[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* Contact Form File */
  def apply/*2.2*/(queryForm: Form[_], name:Option[String])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Contact Me")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""

"""),format.raw/*8.1*/("""if(name != None) """),format.raw/*8.18*/("""{"""),format.raw/*8.19*/("""
	"""),format.raw/*9.2*/("""<h2>Hello, """),_display_(/*9.14*/name/*9.18*/.getOrElse("not logged in")),format.raw/*9.45*/(""" """),format.raw/*9.46*/("""Contact me!</h2>
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""
"""),format.raw/*11.1*/("""else """),format.raw/*11.6*/("""{"""),format.raw/*11.7*/("""
	"""),format.raw/*12.2*/("""<h2> Contact Information</h2>
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""<div class="navbar-default">
  <a class="active" href="home" id="home">Home</a>
  <a href="news" id="news">News</a>
  <a href="contact" id="contact">Contact</a>
  <a href="about" id="about">About</a>
  <a href="gallery" id="gallery">Gallery</a>
</div>
<p>
  Katie Lillback
</p>
<p>
  dlillbac
</p>
<p>
  (210) 867-0693
</p>
<p>
  780 Terrell Road, San Antonio, TX 78209
</p>

<h2> Email me</h2>

<form action="query" method="post">
  <input type="email" name="address" size="30">Email Address</input>
  <br>
  <textarea name="query" rows="10" columns="200"></textarea>
  <br>
  <input type="submit"></input>
</form>
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(queryForm:Form[_$1] forSome { 
   type _$1
},name:Option[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(queryForm,name)(messages)

  def f:((Form[_$1] forSome { 
   type _$1
},Option[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (queryForm,name) => (messages) => apply(queryForm,name)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 14:00:55 CDT 2019
                  SOURCE: /users/afeeney/WebApp/InteriorDesign-WebApps-S19/server/app/views/contact.scala.html
                  HASH: 9ce8c3b518df639ba3c42ef625db2a97c22d22bd
                  MATRIX: 802->25|945->98|989->96|1016->114|1043->116|1069->134|1108->136|1136->138|1180->155|1208->156|1236->158|1274->170|1286->174|1333->201|1361->202|1405->219|1433->220|1461->221|1493->226|1521->227|1550->229|1607->259|1635->260|1664->262|2311->879
                  LINES: 23->2|26->4|29->3|30->5|31->6|31->6|31->6|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|35->10|35->10|36->11|36->11|36->11|37->12|38->13|38->13|40->15|69->44
                  -- GENERATED --
              */
          