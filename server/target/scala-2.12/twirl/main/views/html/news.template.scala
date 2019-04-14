
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

object news extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* news Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Interior Design Updates")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""

"""),format.raw/*6.1*/("""<head>
   <title>Interior Design News</title>
   <link rel="stylesheet" media="screen" href=""""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.96*/("""">
   <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("images/favicon.png")),format.raw/*9.99*/("""">
   <script type="text/javascript" src=""""),_display_(/*10.41*/routes/*10.47*/.Assets.at("javascripts/main.js")),format.raw/*10.80*/(""""></script>
   
</head>
<body>

   <h2>Updates about the company?</h2>
   <div class="navbar-default">
  		<a class="active" href="home" id="home">Home</a>
	  	<a href="news" id="news">News</a>
	  	<a href="contact" id="contact">Contact</a>
	  	<a href="about" id="about">About</a>
	  	<a href="gallery" id="gallery">Gallery</a>
	</div>
</body>
""")))}))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 13:17:04 CDT 2019
                  SOURCE: /users/npatel5/workspace/InteriorDesign-WebApps-S19/server/app/views/news.scala.html
                  HASH: 20f1c7fa35bd257a75bf6e67f84b7cd332f8babd
                  MATRIX: 745->26|851->39|878->41|917->72|956->74|984->76|1104->170|1118->176|1179->217|1261->273|1275->279|1334->318|1404->361|1419->367|1473->400
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10
                  -- GENERATED --
              */
          