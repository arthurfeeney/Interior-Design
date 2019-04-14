
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

object anotherGallery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /* Gallery Page File */
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("AnotherGallery")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* """),format.raw/*10.3*/("""{"""),format.raw/*10.4*/("""
  """),format.raw/*11.3*/("""box-sizing: border-box;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""body """),format.raw/*14.6*/("""{"""),format.raw/*14.7*/("""
  """),format.raw/*15.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

"""),format.raw/*19.1*/(""".header """),format.raw/*19.9*/("""{"""),format.raw/*19.10*/("""
  """),format.raw/*20.3*/("""text-align: center;
  padding: 32px;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/(""".row """),format.raw/*24.6*/("""{"""),format.raw/*24.7*/("""
  """),format.raw/*25.3*/("""display: -ms-flexbox; /* IE 10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE 10 */
  flex-wrap: wrap;
  padding: 0 4px;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""

"""),format.raw/*32.1*/("""/* Create three equal columns that sits next to each other */
.column """),format.raw/*33.9*/("""{"""),format.raw/*33.10*/("""
  """),format.raw/*34.3*/("""-ms-flex: 33%; /* IE 10 */
  flex: 33%;
  padding: 0 4px;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

"""),format.raw/*39.1*/(""".column img """),format.raw/*39.13*/("""{"""),format.raw/*39.14*/("""
  """),format.raw/*40.3*/("""margin-top: 8px;
  vertical-align: middle;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/("""/* Style the buttons */
.btn """),format.raw/*45.6*/("""{"""),format.raw/*45.7*/("""
  """),format.raw/*46.3*/("""border: none;
  outline: none;
  padding: 10px 16px;
  background-color: #f1f1f1;
  cursor: pointer;
  font-size: 18px;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/(""".btn:hover """),format.raw/*54.12*/("""{"""),format.raw/*54.13*/("""
  """),format.raw/*55.3*/("""background-color: #ddd;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

"""),format.raw/*58.1*/(""".btn.active """),format.raw/*58.13*/("""{"""),format.raw/*58.14*/("""
  """),format.raw/*59.3*/("""background-color: #666;
  color: white;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""

"""),format.raw/*63.1*/(""".overlay """),format.raw/*63.10*/("""{"""),format.raw/*63.11*/("""
  """),format.raw/*64.3*/("""position: absolute; 
  bottom: 0; 
  background: rgb(0, 0, 0);
  background: rgba(0, 0, 0, 0.5); /* Black see-through */
  color: #f1f1f1; 
  width: 33%;
  transition: .5s ease;
  opacity:0;
  color: white;
  font-size: 20px;
  padding: 20px;
  text-align: center;
  margin-top: 8px;
  vertical-align: middle;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""

"""),format.raw/*80.1*/(""".column img:hover """),format.raw/*80.19*/("""{"""),format.raw/*80.20*/("""
  """),format.raw/*81.3*/("""opacity: 0.7;
  transition: opacity 0.5s ease-out;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""

"""),format.raw/*85.1*/("""/* Clear floats after the columns */
.row:after """),format.raw/*86.12*/("""{"""),format.raw/*86.13*/("""
  """),format.raw/*87.3*/("""content: "";
  display: table;
  clear: both;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""

"""),format.raw/*92.1*/("""/* The expanding image container */
.container """),format.raw/*93.12*/("""{"""),format.raw/*93.13*/("""
  """),format.raw/*94.3*/("""display:none;
  position:fixed;
  left: 25%;
  top: 25%;
  //margin-left: auto;
  //margin-right: auto;
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""

"""),format.raw/*102.1*/("""/* Expanding image text */
#imgtext """),format.raw/*103.10*/("""{"""),format.raw/*103.11*/("""
  """),format.raw/*104.3*/("""position: absolute;
  bottom: 15px;
  left: 15px;
  color: white;
  font-size: 20px;
"""),format.raw/*109.1*/("""}"""),format.raw/*109.2*/("""

"""),format.raw/*111.1*/("""/* Closable button inside the expanded image */
.closebtn """),format.raw/*112.11*/("""{"""),format.raw/*112.12*/("""
  """),format.raw/*113.3*/("""position: absolute;
  top: 10px;
  right: 15px;
  color: white;
  font-size: 35px;
  cursor: pointer;
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/("""
"""),format.raw/*120.1*/("""</style>
</head>
<body>

<!-- Header -->
<div class="header" id="myHeader">
  <h1>Interior Design Gallery</h1>
   <br>
</div>

<!-- Image Grid -->
<div class="row"> 
  <div class="column">
    <img src="https://freshome.com/wp-content/uploads/2018/01/decorator-living.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://www.collegeforcreativestudies.edu/files/assets/images/large/1504212008_header_IN.jpg" style="width:100%"alt="example" onclick="expand(this);">
    <img src="http://www.dawsondesignassociates.com/images/home/DDA-Hospitality-Interior-Design-2a.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://nyocommercialobserver.files.wordpress.com/2018/08/0009_determinedbydesign_01_11_18_large.jpg?w=640&h=427" style="width:100%"alt="example" onclick="expand(this);">
    <img src="https://timedotcom.files.wordpress.com/2018/08/the-curated-home-grant-gibson-2.jpeg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://www.pagodared.com/blog/wp-content/uploads/2018/05/4-Mark_D_Sikes_Beverly_Hills_1.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://content.thriveglobal.com/wp-content/uploads/2019/03/GettyImages-999732712.jpg" style="width:100%" alt="example" onclick="expand(this);">
  </div>
  <div class="column">
    <img src="https://www.chitkara.edu.in/wp-content/uploads/2019/02/INTERIOR-DESIGN1.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://static1.squarespace.com/static/54eb4c37e4b07c3f6564f207/54eb4f16e4b07c01c5c411b1/54ef5ecbe4b025105a4f6948/1424973516099/Livingroom+2.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://www.hometown.in/design-build/static/slider-1b.4ec10847.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://industryreports24.com/wp-content/uploads/2019/04/Interior-Design.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://lifetimeluxury.com/wp-content/uploads/2017/12/Interior-Design-Room.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://cdn.styleblueprint.com/wp-content/uploads/2019/02/MurphyMaude-Watson-SelaviePhoto-31.jpg" style="width:100%" alt="example" onclick="expand(this);"> 
 <img src="https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2012/2/1/0/CI-Thibaut_Barrowgate-living-room-wallpaper-settee_s3x4.jpg.rend.hgtvcom.616.822.suffix/1400965159581.jpeg" style="width:100%" alt="example" onclick="expand(this);">
 </div>  
  <div class="column">
    <img src="https://www.sbid.org/wp-content/uploads/2018/02/img7-e1517585569791.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="http://www.sb-id.com/uploads/highlights/8_swissvilla.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="http://www.contemporist.com/wp-content/uploads/2019/03/modern-cafe-restaurant-interior-design-020319-726-01-800x420.jpg" style="width:100%"  alt="example" onclick="expand(this);">
    <img src="http://www.imgnyc.com/wp-content/uploads/2018/06/poster-mspt-time-lapse-v3.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://i.pinimg.com/736x/89/dc/1d/89dc1d70c121e8ab81b81f601b581a04.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://super.homelane.com/ogimage-2.jpg" style="width:100%" alt="example" onclick="expand(this);">
    <img src="https://media.architecturaldigest.com/photos/5744d37dff9db5a43d5cf9c6/master/w_2626,h_1905,c_limit/contemporary-interior-design-004.jpg" style="width:100%" alt="example" onclick="expand(this);">
  </div>
</div>
<div class="container">
  <span onclick="this.parentElement.style.display='none'" class="closebtn">&times;</span>
  <img id="expandedImg" style="width:100%">
  <div id="imgtext"></div>
</div>

<script>
function expand(imgs) """),format.raw/*167.23*/("""{"""),format.raw/*167.24*/("""
  """),format.raw/*168.3*/("""var expandImg = document.getElementById("expandedImg");
  var imgText = document.getElementById("imgtext");
  expandImg.src = imgs.src;
  imgText.innerHTML = imgs.alt;
  expandImg.parentElement.style.display = "block";
"""),format.raw/*173.1*/("""}"""),format.raw/*173.2*/("""
"""),format.raw/*174.1*/("""</script>

</body>
</html>
""")))}),format.raw/*178.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 14 13:17:04 CDT 2019
                  SOURCE: /users/npatel5/workspace/InteriorDesign-WebApps-S19/server/app/views/anotherGallery.scala.html
                  HASH: efaaa6d32543bee72ca0f969c275339f8d8e1642
                  MATRIX: 839->26|869->48|908->50|936->52|1074->163|1102->164|1132->167|1183->191|1211->192|1240->194|1272->199|1300->200|1330->203|1413->259|1441->260|1470->262|1505->270|1534->271|1564->274|1628->311|1656->312|1685->314|1717->319|1745->320|1775->323|1925->446|1953->447|1982->449|2079->519|2108->520|2138->523|2223->581|2251->582|2280->584|2320->596|2349->597|2379->600|2449->643|2477->644|2506->646|2562->675|2590->676|2620->679|2767->799|2795->800|2824->802|2863->813|2892->814|2922->817|2973->841|3001->842|3030->844|3070->856|3099->857|3129->860|3196->900|3224->901|3253->903|3290->912|3319->913|3349->916|3686->1226|3714->1227|3743->1229|3789->1247|3818->1248|3848->1251|3926->1302|3954->1303|3983->1305|4059->1353|4088->1354|4118->1357|4191->1403|4219->1404|4248->1406|4323->1453|4352->1454|4382->1457|4514->1561|4543->1562|4573->1564|4638->1600|4668->1601|4699->1604|4812->1689|4841->1690|4871->1692|4958->1750|4988->1751|5019->1754|5149->1856|5178->1857|5207->1858|9183->5805|9213->5806|9244->5809|9491->6028|9520->6029|9549->6030|9608->6058
                  LINES: 26->3|26->3|26->3|28->5|33->10|33->10|34->11|35->12|35->12|37->14|37->14|37->14|38->15|40->17|40->17|42->19|42->19|42->19|43->20|45->22|45->22|47->24|47->24|47->24|48->25|53->30|53->30|55->32|56->33|56->33|57->34|60->37|60->37|62->39|62->39|62->39|63->40|65->42|65->42|67->44|68->45|68->45|69->46|75->52|75->52|77->54|77->54|77->54|78->55|79->56|79->56|81->58|81->58|81->58|82->59|84->61|84->61|86->63|86->63|86->63|87->64|101->78|101->78|103->80|103->80|103->80|104->81|106->83|106->83|108->85|109->86|109->86|110->87|113->90|113->90|115->92|116->93|116->93|117->94|123->100|123->100|125->102|126->103|126->103|127->104|132->109|132->109|134->111|135->112|135->112|136->113|142->119|142->119|143->120|190->167|190->167|191->168|196->173|196->173|197->174|201->178
                  -- GENERATED --
              */
          