
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
  Diane Lillback
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


"""),_display_(/*24.2*/helper/*24.8*/.inputText(queryForm("Email Address"), 'id -> "address", 'size -> 30)),format.raw/*24.77*/("""
"""),_display_(/*25.2*/helper/*25.8*/.textarea(queryForm("Email Body"), 'id -> "query", 'rows -> 10, 'cols -> 100)),format.raw/*25.85*/("""

""")))}),format.raw/*27.2*/("""
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
                  DATE: Fri Apr 05 14:35:30 CDT 2019
                  SOURCE: /users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/app/views/contact.scala.html
                  HASH: 7f65d6ffa5c3adfdcd201c4cbb5c6537b2b40a32
                  MATRIX: 787->25|909->77|953->75|980->93|1007->95|1033->113|1072->115|1099->116|1301->292|1315->298|1405->367|1433->369|1447->375|1545->452|1578->455
                  LINES: 23->2|26->4|29->3|30->5|31->6|31->6|31->6|32->7|49->24|49->24|49->24|50->25|50->25|50->25|52->27
                  -- GENERATED --
              */
          