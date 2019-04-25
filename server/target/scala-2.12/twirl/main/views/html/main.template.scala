
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script type="text/javascript" src=""""),_display_(/*10.42*/routes/*10.48*/.Assets.at("javascripts/main.js")),format.raw/*10.81*/(""""></script>
    
  </head>
  <body>
    """),_display_(/*14.6*/content),format.raw/*14.13*/("""
    """),_display_(/*15.6*/scalajs/*15.13*/.html.scripts("client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*15.129*/("""
  """),format.raw/*16.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 15:44:59 CDT 2019
                  SOURCE: /users/cluikart/InteriorDesign-WebApps-S19/server/app/views/main.scala.html
                  HASH: 7edbc931863cec7a94d7421bff2d2825363b312d
                  MATRIX: 733->1|857->32|884->33|955->78|980->83|1064->141|1078->147|1139->188|1222->245|1236->251|1296->290|1367->334|1382->340|1436->373|1503->414|1531->421|1563->427|1579->434|1717->550|1747->553
                  LINES: 21->1|26->2|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|38->14|38->14|39->15|39->15|39->15|40->16
                  -- GENERATED --
              */
          