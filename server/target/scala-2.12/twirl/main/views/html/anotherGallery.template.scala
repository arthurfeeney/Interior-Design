
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

* """),format.raw/*11.3*/("""{"""),format.raw/*11.4*/("""
  """),format.raw/*12.3*/("""box-sizing: border-box;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""body """),format.raw/*15.6*/("""{"""),format.raw/*15.7*/("""
  """),format.raw/*16.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/(""".header """),format.raw/*20.9*/("""{"""),format.raw/*20.10*/("""
  """),format.raw/*21.3*/("""text-align: center;
  padding: 70px;
  top: 500px;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

"""),format.raw/*26.1*/(""".row """),format.raw/*26.6*/("""{"""),format.raw/*26.7*/("""
  """),format.raw/*27.3*/("""display: -ms-flexbox; /* IE 10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE 10 */
  flex-wrap: wrap;
  padding: 0 4px;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

"""),format.raw/*34.1*/("""/* Create three equal columns that sits next to each other */
.column """),format.raw/*35.9*/("""{"""),format.raw/*35.10*/("""
  """),format.raw/*36.3*/("""-ms-flex: 33%; /* IE 10 */
  flex: 33%;
  padding: 0 4px;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""

"""),format.raw/*41.1*/(""".column img """),format.raw/*41.13*/("""{"""),format.raw/*41.14*/("""
  """),format.raw/*42.3*/("""margin-top: 8px;
  vertical-align: middle;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/("""/* Style the buttons */
.btn """),format.raw/*47.6*/("""{"""),format.raw/*47.7*/("""
  """),format.raw/*48.3*/("""border: none;
  outline: none;
  padding: 10px 16px;
  background-color: #f1f1f1;
  cursor: pointer;
  font-size: 18px;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/(""".btn:hover """),format.raw/*56.12*/("""{"""),format.raw/*56.13*/("""
  """),format.raw/*57.3*/("""background-color: #ddd;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""

"""),format.raw/*60.1*/(""".btn.active """),format.raw/*60.13*/("""{"""),format.raw/*60.14*/("""
  """),format.raw/*61.3*/("""background-color: #666;
  color: white;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/(""".overlay """),format.raw/*65.10*/("""{"""),format.raw/*65.11*/("""
  """),format.raw/*66.3*/("""position: absolute; 
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
"""),format.raw/*80.1*/("""}"""),format.raw/*80.2*/("""

"""),format.raw/*82.1*/(""".column img:hover """),format.raw/*82.19*/("""{"""),format.raw/*82.20*/("""
  """),format.raw/*83.3*/("""opacity: 0.7;
  transition: opacity 0.5s ease-out;
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""

"""),format.raw/*87.1*/("""/* Clear floats after the columns */
.row:after """),format.raw/*88.12*/("""{"""),format.raw/*88.13*/("""
  """),format.raw/*89.3*/("""content: "";
  display: table;
  clear: both;
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""

"""),format.raw/*94.1*/("""/* The expanding image container */
.container """),format.raw/*95.12*/("""{"""),format.raw/*95.13*/("""
  """),format.raw/*96.3*/("""display:none;
  position:fixed;
  left: 25%;
  top: 25%;
  //margin-left: auto;
  //margin-right: auto;
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""

"""),format.raw/*104.1*/("""/* Expanding image text */
#imgtext """),format.raw/*105.10*/("""{"""),format.raw/*105.11*/("""
  """),format.raw/*106.3*/("""position: absolute;
  bottom: 15px;
  left: 15px;
  color: white;
  font-size: 20px;
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""

"""),format.raw/*113.1*/("""/* Closable button inside the expanded image */
.closebtn """),format.raw/*114.11*/("""{"""),format.raw/*114.12*/("""
  """),format.raw/*115.3*/("""position: absolute;
  top: 10px;
  right: 15px;
  color: white;
  font-size: 35px;
  cursor: pointer;
"""),format.raw/*121.1*/("""}"""),format.raw/*121.2*/("""

"""),format.raw/*123.1*/(""".navbar """),format.raw/*123.9*/("""{"""),format.raw/*123.10*/("""
  """),format.raw/*124.3*/("""overflow: hidden;
  background-color: #333;
  font-family: Arial;
  width: 100%;
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/("""

"""),format.raw/*130.1*/("""/* Links inside the navbar */
.navbar h2 """),format.raw/*131.12*/("""{"""),format.raw/*131.13*/("""
  """),format.raw/*132.3*/("""float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  
"""),format.raw/*139.1*/("""}"""),format.raw/*139.2*/("""

"""),format.raw/*141.1*/("""/* The dropdown container */
.dropdown """),format.raw/*142.11*/("""{"""),format.raw/*142.12*/("""
  """),format.raw/*143.3*/("""float: left;
  overflow: hidden;
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""

"""),format.raw/*147.1*/("""/* Dropdown h2 */
.dropdown .dropbtn """),format.raw/*148.20*/("""{"""),format.raw/*148.21*/("""
  """),format.raw/*149.3*/("""font-size: 16px; 
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
"""),format.raw/*157.1*/("""}"""),format.raw/*157.2*/("""

"""),format.raw/*159.1*/("""/* Add a red background color to navbar links on hover */
.navbar h2:hover, .dropdown:hover .dropbtn """),format.raw/*160.44*/("""{"""),format.raw/*160.45*/("""
  """),format.raw/*161.3*/("""background-color: red;
"""),format.raw/*162.1*/("""}"""),format.raw/*162.2*/("""

"""),format.raw/*164.1*/("""/* Dropdown content (hidden by default) */
.dropdown-content """),format.raw/*165.19*/("""{"""),format.raw/*165.20*/("""
  """),format.raw/*166.3*/("""display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  
"""),format.raw/*172.1*/("""}"""),format.raw/*172.2*/("""

"""),format.raw/*174.1*/("""/* Links inside the dropdown */
.dropdown-content h2 """),format.raw/*175.22*/("""{"""),format.raw/*175.23*/("""
  """),format.raw/*176.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
  
"""),format.raw/*183.1*/("""}"""),format.raw/*183.2*/("""

"""),format.raw/*185.1*/("""/* Add a grey background color to dropdown links on hover */
.dropdown-content h2:hover """),format.raw/*186.28*/("""{"""),format.raw/*186.29*/("""
  """),format.raw/*187.3*/("""background-color: #ddd;
  
"""),format.raw/*189.1*/("""}"""),format.raw/*189.2*/("""

"""),format.raw/*191.1*/("""/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content """),format.raw/*192.35*/("""{"""),format.raw/*192.36*/("""
  """),format.raw/*193.3*/("""display: block;
  
"""),format.raw/*195.1*/("""}"""),format.raw/*195.2*/("""

"""),format.raw/*197.1*/(""".dropdown """),format.raw/*197.11*/("""{"""),format.raw/*197.12*/("""
	"""),format.raw/*198.2*/("""color: red;
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""

"""),format.raw/*201.1*/(""".sticky """),format.raw/*201.9*/("""{"""),format.raw/*201.10*/("""
  """),format.raw/*202.3*/("""position: fixed;
  top: 0;
  
  z-index: 5;
"""),format.raw/*206.1*/("""}"""),format.raw/*206.2*/("""
"""),format.raw/*207.1*/(""".sticky + .content """),format.raw/*207.20*/("""{"""),format.raw/*207.21*/("""
  """),format.raw/*208.3*/("""padding-top: 60px;
"""),format.raw/*209.1*/("""}"""),format.raw/*209.2*/("""


"""),format.raw/*212.1*/("""</style>
</head>
<body>

<div class="navbar sticky">
	<h2>Swap</h2>
	<h2>Delete</h2>
	<h2>Add</h2>
	<h2>Modify</h2>
	<div class="dropdown">
		<button class="dropbtn">Filter
			<i class="fa fa-caret-down"></i>
		</button>
		<div class = "dropdown-content sticky">
			<h2 class="filter">by ID</h2>
			<h2 class="filter">by Tag</h2>
			<h2 class="filter">by Date</h2>
		</div>
	</div>
</div>

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
function expand(imgs) """),format.raw/*276.23*/("""{"""),format.raw/*276.24*/("""
  """),format.raw/*277.3*/("""var expandImg = document.getElementById("expandedImg");
  var imgText = document.getElementById("imgtext");
  expandImg.src = imgs.src;
  imgText.innerHTML = imgs.alt;
  expandImg.parentElement.style.display = "block";
"""),format.raw/*282.1*/("""}"""),format.raw/*282.2*/("""
"""),format.raw/*283.1*/("""</script>

</body>
</html>
""")))}),format.raw/*287.2*/("""

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
                  DATE: Thu Apr 25 17:55:17 CDT 2019
                  SOURCE: /users/cluikart/InteriorDesign-WebApps-S19/server/app/views/anotherGallery.scala.html
                  HASH: 62b94640864436fc5392ee91ca075cd13b3e0742
                  MATRIX: 839->26|869->48|908->50|936->52|1075->164|1103->165|1133->168|1184->192|1212->193|1241->195|1273->200|1301->201|1331->204|1414->260|1442->261|1471->263|1506->271|1535->272|1565->275|1643->326|1671->327|1700->329|1732->334|1760->335|1790->338|1940->461|1968->462|1997->464|2094->534|2123->535|2153->538|2238->596|2266->597|2295->599|2335->611|2364->612|2394->615|2464->658|2492->659|2521->661|2577->690|2605->691|2635->694|2782->814|2810->815|2839->817|2878->828|2907->829|2937->832|2988->856|3016->857|3045->859|3085->871|3114->872|3144->875|3211->915|3239->916|3268->918|3305->927|3334->928|3364->931|3701->1241|3729->1242|3758->1244|3804->1262|3833->1263|3863->1266|3941->1317|3969->1318|3998->1320|4074->1368|4103->1369|4133->1372|4206->1418|4234->1419|4263->1421|4338->1468|4367->1469|4397->1472|4529->1576|4558->1577|4588->1579|4653->1615|4683->1616|4714->1619|4827->1704|4856->1705|4886->1707|4973->1765|5003->1766|5034->1769|5164->1871|5193->1872|5223->1874|5259->1882|5289->1883|5320->1886|5429->1967|5458->1968|5488->1970|5558->2011|5588->2012|5619->2015|5767->2135|5796->2136|5826->2138|5894->2177|5924->2178|5955->2181|6016->2214|6045->2215|6075->2217|6141->2254|6171->2255|6202->2258|6489->2517|6518->2518|6548->2520|6678->2621|6708->2622|6739->2625|6790->2648|6819->2649|6849->2651|6939->2712|6969->2713|7000->2716|7165->2853|7194->2854|7224->2856|7306->2909|7336->2910|7367->2913|7512->3030|7541->3031|7571->3033|7688->3121|7718->3122|7749->3125|7804->3152|7833->3153|7863->3155|7964->3227|7994->3228|8025->3231|8072->3250|8101->3251|8131->3253|8170->3263|8200->3264|8230->3266|8270->3278|8299->3279|8329->3281|8365->3289|8395->3290|8426->3293|8498->3337|8527->3338|8556->3339|8604->3358|8634->3359|8665->3362|8712->3381|8741->3382|8772->3385|13113->7697|13143->7698|13174->7701|13421->7920|13450->7921|13479->7922|13538->7950
                  LINES: 26->3|26->3|26->3|28->5|34->11|34->11|35->12|36->13|36->13|38->15|38->15|38->15|39->16|41->18|41->18|43->20|43->20|43->20|44->21|47->24|47->24|49->26|49->26|49->26|50->27|55->32|55->32|57->34|58->35|58->35|59->36|62->39|62->39|64->41|64->41|64->41|65->42|67->44|67->44|69->46|70->47|70->47|71->48|77->54|77->54|79->56|79->56|79->56|80->57|81->58|81->58|83->60|83->60|83->60|84->61|86->63|86->63|88->65|88->65|88->65|89->66|103->80|103->80|105->82|105->82|105->82|106->83|108->85|108->85|110->87|111->88|111->88|112->89|115->92|115->92|117->94|118->95|118->95|119->96|125->102|125->102|127->104|128->105|128->105|129->106|134->111|134->111|136->113|137->114|137->114|138->115|144->121|144->121|146->123|146->123|146->123|147->124|151->128|151->128|153->130|154->131|154->131|155->132|162->139|162->139|164->141|165->142|165->142|166->143|168->145|168->145|170->147|171->148|171->148|172->149|180->157|180->157|182->159|183->160|183->160|184->161|185->162|185->162|187->164|188->165|188->165|189->166|195->172|195->172|197->174|198->175|198->175|199->176|206->183|206->183|208->185|209->186|209->186|210->187|212->189|212->189|214->191|215->192|215->192|216->193|218->195|218->195|220->197|220->197|220->197|221->198|222->199|222->199|224->201|224->201|224->201|225->202|229->206|229->206|230->207|230->207|230->207|231->208|232->209|232->209|235->212|299->276|299->276|300->277|305->282|305->282|306->283|310->287
                  -- GENERATED --
              */
          