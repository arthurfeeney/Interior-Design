
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* about Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("About Katie")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
  """),format.raw/*5.3*/("""<head>
    <title>Interior Design News</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <script type="text/javascript" src=""""),_display_(/*9.42*/routes/*9.48*/.Assets.at("javascripts/main.js")),format.raw/*9.81*/(""""></script>
    
  </head>
  <body>
    <h2>About Katie and the company. Distinct from gallery, but has some images</h2>
    <div class="navbar-default">
	  <a class="active" href="home" id="home">Home</a>
	  <a href="news" id="news">News</a>
	  <a href="contact" id="contact">Contact</a>
	  <a href="about" id="about">About</a>
	  <a href="gallery" id="gallery">Gallery</a>
	</div>
	
	<div class="mz-module-about">
	<p>Passion for home</p>
	<p>A History of living</p>
	<p>My name is Katie. I'm a bit Southern, North-Eastern and South-Western. I don’t think a day goes by that I am not creatively invested in home design.
		My home design incorporates passion, love, energy, color, and excitement. Something about creating space; to spend time, come and go from, exist in, is my hearts desire. I have worked many years in different parts of the country. I am inspired by homes that are lived in as well beautiful. Our surroundings are meant to be a reflection of the things we care about. The people we care about sharing memories with. It’s not about being in or out of style. It’s about living life in a home you love.
		I want to serve as the light you need to get there. </p>
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
                  DATE: Wed Apr 10 15:54:10 CDT 2019
                  SOURCE: /Users/Nihil/workspace/InteriorDesign-WebApps-S19/server/app/views/about.scala.html
                  HASH: 5f72e39667d3c2f7a2376d24e7161a0713bcdc47
                  MATRIX: 747->27|853->40|880->42|907->61|946->63|975->66|1097->162|1111->168|1172->209|1255->266|1269->272|1329->311|1399->355|1413->361|1466->394
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9
                  -- GENERATED --
              */
          