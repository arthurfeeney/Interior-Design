
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

object gallery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* Gallery Page File */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Gallery")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* """),format.raw/*8.3*/("""{"""),format.raw/*8.4*/("""
  """),format.raw/*9.3*/("""box-sizing: border-box;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/("""body """),format.raw/*12.6*/("""{"""),format.raw/*12.7*/("""
  """),format.raw/*13.3*/("""margin: 0;
  font-family: Arial;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

"""),format.raw/*17.1*/("""/* The grid: Four equal columns that floats next to each other */
.column """),format.raw/*18.9*/("""{"""),format.raw/*18.10*/("""
  """),format.raw/*19.3*/("""float: left;
  width: 25%;
  padding: 10px;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/("""/* Style the images inside the grid */
.column img """),format.raw/*25.13*/("""{"""),format.raw/*25.14*/("""
  """),format.raw/*26.3*/("""opacity: 0.8; 
  cursor: pointer; 
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

"""),format.raw/*30.1*/(""".column img:hover """),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""
  """),format.raw/*31.3*/("""opacity: 1;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

"""),format.raw/*34.1*/("""/* Clear floats after the columns */
.row:after """),format.raw/*35.12*/("""{"""),format.raw/*35.13*/("""
  """),format.raw/*36.3*/("""content: "";
  display: table;
  clear: both;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/("""/* The expanding image container */
.container """),format.raw/*42.12*/("""{"""),format.raw/*42.13*/("""
  """),format.raw/*43.3*/("""position: relative;
  display: none;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""

"""),format.raw/*47.1*/("""/* Expanding image text */
#imgtext """),format.raw/*48.10*/("""{"""),format.raw/*48.11*/("""
  """),format.raw/*49.3*/("""position: absolute;
  bottom: 15px;
  left: 15px;
  color: white;
  font-size: 20px;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""/* Closable button inside the expanded image */
.closebtn """),format.raw/*57.11*/("""{"""),format.raw/*57.12*/("""
  """),format.raw/*58.3*/("""position: absolute;
  top: 10px;
  right: 15px;
  color: white;
  font-size: 35px;
  cursor: pointer;
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""
"""),format.raw/*65.1*/("""</style>
</head>
<body>
<h2> Gallery </h2>
<div class="row">
  <div class=""""),_display_(/*70.16*/routes/*70.22*/.Assets.versioned("images/325Casita.jpg")),format.raw/*70.63*/("""" alt="Casita" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*73.16*/routes/*73.22*/.Assets.versioned("images/325Library.jpg")),format.raw/*73.64*/("""" alt="Library" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*76.16*/routes/*76.22*/.Assets.versioned("images/325living.jpg")),format.raw/*76.63*/("""" alt="Living Room" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*79.16*/routes/*79.22*/.Assets.versioned("images/325livingWindow.jpg")),format.raw/*79.69*/("""" alt="Living Room" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*82.16*/routes/*82.22*/.Assets.versioned("images/325Master.jpg")),format.raw/*82.63*/("""" alt="Master Bedroom" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*85.16*/routes/*85.22*/.Assets.versioned("images/325sitting.jpg")),format.raw/*85.64*/("""" alt="Living Room" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*88.16*/routes/*88.22*/.Assets.versioned("images/3living.jpg")),format.raw/*88.61*/("""" alt="Formal Living Room" style="width:100%" onclick="myFunction(this);">
  </div>
    <div class="column">
    <img src=""""),_display_(/*91.16*/routes/*91.22*/.Assets.versioned("images/441living.jpg")),format.raw/*91.63*/("""" alt="Living Room" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*94.16*/routes/*94.22*/.Assets.versioned("images/441master.jpg")),format.raw/*94.63*/("""" alt="Master Bedroom" style="width:100%" onclick="myFunction(this);">
  </div>
  <div class="column">
    <img src=""""),_display_(/*97.16*/routes/*97.22*/.Assets.versioned("images/441study.jpg")),format.raw/*97.62*/("""" alt="Study" style="width:100%" onclick="myFunction(this);">
  </div>
    <img src=""""),_display_(/*99.16*/routes/*99.22*/.Assets.versioned("images/bathroom325.jpg")),format.raw/*99.65*/("""" alt="Bathroom" style="width:100%" onclick="myFunction(this);">
  </div>
</div>

<div class="container">
  <span onclick="this.parentElement.style.display='none'" class="closebtn">&times;</span>
  <img id="expandedImg" style="width:100%">
  <div id="imgtext"></div>
</div>

<script>
function myFunction(imgs) """),format.raw/*110.27*/("""{"""),format.raw/*110.28*/("""
  """),format.raw/*111.3*/("""var expandImg = document.getElementById("expandedImg");
  var imgText = document.getElementById("imgtext");
  expandImg.src = imgs.src;
  imgText.innerHTML = imgs.alt;
  expandImg.parentElement.style.display = "block";
"""),format.raw/*116.1*/("""}"""),format.raw/*116.2*/("""
"""),format.raw/*117.1*/("""</script>

</body>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 05 15:36:15 CDT 2019
                  SOURCE: /users/alillbac/csci3345/InteriorDesign-WebApps-S19/server/app/views/gallery.scala.html
                  HASH: 2cf0c14f9ec00bdaf38774f457d8d674c95f1e51
                  MATRIX: 832->26|855->41|894->43|922->45|1034->131|1061->132|1090->135|1141->159|1169->160|1198->162|1230->167|1258->168|1288->171|1348->204|1376->205|1405->207|1506->281|1535->282|1565->285|1636->329|1664->330|1693->332|1772->383|1801->384|1831->387|1893->422|1921->423|1950->425|1996->443|2025->444|2055->447|2094->459|2122->460|2151->462|2227->510|2256->511|2286->514|2359->560|2387->561|2416->563|2491->610|2520->611|2550->614|2614->651|2642->652|2671->654|2735->690|2764->691|2794->694|2906->779|2934->780|2963->782|3049->840|3078->841|3108->844|3237->946|3265->947|3293->948|3396->1024|3411->1030|3473->1071|3610->1181|3625->1187|3688->1229|3826->1340|3841->1346|3903->1387|4045->1502|4060->1508|4128->1555|4270->1670|4285->1676|4347->1717|4492->1835|4507->1841|4570->1883|4712->1998|4727->2004|4787->2043|4938->2167|4953->2173|5015->2214|5157->2329|5172->2335|5234->2376|5379->2494|5394->2500|5455->2540|5568->2626|5583->2632|5647->2675|5986->2985|6016->2986|6047->2989|6294->3208|6323->3209|6352->3210
                  LINES: 26->3|26->3|26->3|28->5|31->8|31->8|32->9|33->10|33->10|35->12|35->12|35->12|36->13|38->15|38->15|40->17|41->18|41->18|42->19|45->22|45->22|47->24|48->25|48->25|49->26|51->28|51->28|53->30|53->30|53->30|54->31|55->32|55->32|57->34|58->35|58->35|59->36|62->39|62->39|64->41|65->42|65->42|66->43|68->45|68->45|70->47|71->48|71->48|72->49|77->54|77->54|79->56|80->57|80->57|81->58|87->64|87->64|88->65|93->70|93->70|93->70|96->73|96->73|96->73|99->76|99->76|99->76|102->79|102->79|102->79|105->82|105->82|105->82|108->85|108->85|108->85|111->88|111->88|111->88|114->91|114->91|114->91|117->94|117->94|117->94|120->97|120->97|120->97|122->99|122->99|122->99|133->110|133->110|134->111|139->116|139->116|140->117
                  -- GENERATED --
              */
          