
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[_$1] forSome { 
   type _$1
},Messages,play.twirl.api.HtmlFormat.Appendable] {

  /* Contact Form File */
  def apply/*2.2*/(queryForm: Form[_])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Contact Me")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
"""),format.raw/*7.1*/("""<h2> Contact Information</h2>
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
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(queryForm:Form[_$1] forSome { 
   type _$1
},messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(queryForm)(messages)

  def f:((Form[_$1] forSome { 
   type _$1
}) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (queryForm) => (messages) => apply(queryForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 15:13:16 CDT 2019
                  SOURCE: /Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/app/views/contact.scala.html
                  HASH: 0b213062f23a261d42ddcd4acdaaeee4f9013d74
                  MATRIX: 787->25|909->77|953->75|980->93|1007->95|1033->113|1072->115|1099->116|1524->511
                  LINES: 23->2|26->4|29->3|30->5|31->6|31->6|31->6|32->7|55->30
                  -- GENERATED --
              */
          