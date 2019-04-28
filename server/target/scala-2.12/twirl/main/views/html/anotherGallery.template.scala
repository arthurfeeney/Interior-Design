
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


#overLay """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
  """),format.raw/*13.3*/("""position: fixed; /* Sit on top of the page content */
  display: none; /* Hidden by default */
  width: 100%; /* Full width (cover the whole page) */
  height: 100%; /* Full height (cover the whole page) */
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0,0,0,0.5); /* Black background with opacity */
  z-index: 2; /* Specify a stack order in case you're using a different order for other elements */
  cursor: pointer; /* Add a pointer on hover */
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""


"""),format.raw/*27.1*/("""* """),format.raw/*27.3*/("""{"""),format.raw/*27.4*/("""
  """),format.raw/*28.3*/("""box-sizing: border-box;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""body """),format.raw/*31.6*/("""{"""),format.raw/*31.7*/("""
  """),format.raw/*32.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".header """),format.raw/*36.9*/("""{"""),format.raw/*36.10*/("""
  """),format.raw/*37.3*/("""text-align: center;
  padding: 70px;
  top: 500px;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/(""".row """),format.raw/*42.6*/("""{"""),format.raw/*42.7*/("""
  """),format.raw/*43.3*/("""display: -ms-flexbox; /* IE 10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE 10 */
  flex-wrap: wrap;
  padding: 0 4px;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""/* Create three equal columns that sits next to each other */
.column """),format.raw/*51.9*/("""{"""),format.raw/*51.10*/("""
  """),format.raw/*52.3*/("""-ms-flex: 33%; /* IE 10 */
  flex: 33%;
  padding: 0 4px;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""

"""),format.raw/*57.1*/(""".column img """),format.raw/*57.13*/("""{"""),format.raw/*57.14*/("""
  """),format.raw/*58.3*/("""margin-top: 8px;
  vertical-align: middle;
"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""

"""),format.raw/*62.1*/("""/* Style the buttons */
.btn """),format.raw/*63.6*/("""{"""),format.raw/*63.7*/("""
  """),format.raw/*64.3*/("""border: none;
  outline: none;
  padding: 10px 16px;
  background-color: #f1f1f1;
  cursor: pointer;
  font-size: 18px;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""

"""),format.raw/*72.1*/(""".btn:hover """),format.raw/*72.12*/("""{"""),format.raw/*72.13*/("""
  """),format.raw/*73.3*/("""background-color: #ddd;
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""

"""),format.raw/*76.1*/(""".btn.active """),format.raw/*76.13*/("""{"""),format.raw/*76.14*/("""
  """),format.raw/*77.3*/("""background-color: #666;
  color: white;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".overlay """),format.raw/*81.10*/("""{"""),format.raw/*81.11*/("""
  """),format.raw/*82.3*/("""position: absolute;
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
"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
"""),format.raw/*97.1*/(""".column img:hover """),format.raw/*97.19*/("""{"""),format.raw/*97.20*/("""
  """),format.raw/*98.3*/("""opacity: 0.7;
  transition: opacity 0.5s ease-out;
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""

"""),format.raw/*102.1*/("""/* Clear floats after the columns */
.row:after """),format.raw/*103.12*/("""{"""),format.raw/*103.13*/("""
  """),format.raw/*104.3*/("""content: "";
  display: table;
  clear: both;
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/("""

"""),format.raw/*109.1*/("""/* The expanding image container */
.container """),format.raw/*110.12*/("""{"""),format.raw/*110.13*/("""
  """),format.raw/*111.3*/("""display:none;
  //position:absolute;
  //left: 25%;
  //right:25%;
  //margin:auto;
    position:fixed;
    top:60px;
    left:0;
    right:0;
    bottom:0;
    margin:auto;
    height:auto;
    width:50%;
                z-index:9999;
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/("""

"""),format.raw/*127.1*/("""/* Expanding image text */
#imgtext """),format.raw/*128.10*/("""{"""),format.raw/*128.11*/("""
  """),format.raw/*129.3*/("""position: absolute;
  bottom: 25px;
  left: 0;
  color: white;
  font-size: 20px;
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
"""),format.raw/*135.1*/("""/* Closable button inside the expanded image */
.closebtn """),format.raw/*136.11*/("""{"""),format.raw/*136.12*/("""
  """),format.raw/*137.3*/("""position: absolute;
  top: 10px;
  right: 15px;
  color: white;
  font-size: 35px;
  cursor: pointer;
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/("""

"""),format.raw/*145.1*/(""".navbar """),format.raw/*145.9*/("""{"""),format.raw/*145.10*/("""
  """),format.raw/*146.3*/("""overflow: hidden;
  background-color: #333;
  font-family: Arial;
  width: 100%;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""

"""),format.raw/*152.1*/("""/* Links inside the navbar */
.navbar h2 """),format.raw/*153.12*/("""{"""),format.raw/*153.13*/("""
  """),format.raw/*154.3*/("""float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""

"""),format.raw/*163.1*/("""/* The dropdown container */
.dropdown """),format.raw/*164.11*/("""{"""),format.raw/*164.12*/("""
  """),format.raw/*165.3*/("""float: left;
  overflow: hidden;
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""

"""),format.raw/*169.1*/("""/* Dropdown h2 */
.dropdown .dropbtn """),format.raw/*170.20*/("""{"""),format.raw/*170.21*/("""
  """),format.raw/*171.3*/("""font-size: 16px; 
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit; /* Important for vertical align on mobile phones */
  margin: 0; /* Important for vertical align on mobile phones */
"""),format.raw/*179.1*/("""}"""),format.raw/*179.2*/("""

"""),format.raw/*181.1*/("""/* Add a red background color to navbar links on hover */
.navbar h2:hover, .dropdown:hover .dropbtn """),format.raw/*182.44*/("""{"""),format.raw/*182.45*/("""
  """),format.raw/*183.3*/("""background-color: red;
"""),format.raw/*184.1*/("""}"""),format.raw/*184.2*/("""

"""),format.raw/*186.1*/("""/* Dropdown content (hidden by default) */
.dropdown-content """),format.raw/*187.19*/("""{"""),format.raw/*187.20*/("""
  """),format.raw/*188.3*/("""display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  
"""),format.raw/*194.1*/("""}"""),format.raw/*194.2*/("""

"""),format.raw/*196.1*/("""/* Links inside the dropdown */
.dropdown-content h2 """),format.raw/*197.22*/("""{"""),format.raw/*197.23*/("""
  """),format.raw/*198.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
  
"""),format.raw/*205.1*/("""}"""),format.raw/*205.2*/("""

"""),format.raw/*207.1*/("""/* Add a grey background color to dropdown links on hover */
.dropdown-content h2:hover """),format.raw/*208.28*/("""{"""),format.raw/*208.29*/("""
  """),format.raw/*209.3*/("""background-color: #ddd;
  
"""),format.raw/*211.1*/("""}"""),format.raw/*211.2*/("""

"""),format.raw/*213.1*/("""/* Show the dropdown menu on hover */
.dropdown:hover .dropdown-content """),format.raw/*214.35*/("""{"""),format.raw/*214.36*/("""
  """),format.raw/*215.3*/("""display: block;
  
"""),format.raw/*217.1*/("""}"""),format.raw/*217.2*/("""

"""),format.raw/*219.1*/(""".dropdown """),format.raw/*219.11*/("""{"""),format.raw/*219.12*/("""
	"""),format.raw/*220.2*/("""color: red;
"""),format.raw/*221.1*/("""}"""),format.raw/*221.2*/("""

"""),format.raw/*223.1*/(""".sticky """),format.raw/*223.9*/("""{"""),format.raw/*223.10*/("""
  """),format.raw/*224.3*/("""position: fixed;
  top: 0;
  
  z-index: 5;
"""),format.raw/*228.1*/("""}"""),format.raw/*228.2*/("""
"""),format.raw/*229.1*/(""".sticky + .content """),format.raw/*229.20*/("""{"""),format.raw/*229.21*/("""
  """),format.raw/*230.3*/("""padding-top: 60px;
"""),format.raw/*231.1*/("""}"""),format.raw/*231.2*/("""


"""),format.raw/*234.1*/("""</style>
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
    <img src="https://freshome.com/wp-content/uploads/2018/01/decorator-living.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://www.collegeforcreativestudies.edu/files/assets/images/large/1504212008_header_IN.jpg" style="width:100%"alt="example" onclick="expand(this);on();">
    <img src="http://www.dawsondesignassociates.com/images/home/DDA-Hospitality-Interior-Design-2a.jpg" style="width:100%" alt="example" onclick="expand(this);on();">
    <img src="https://nyocommercialobserver.files.wordpress.com/2018/08/0009_determinedbydesign_01_11_18_large.jpg?w=640&h=427" style="width:100%"alt="example" onclick="expand(this);on();">
    <img src="https://timedotcom.files.wordpress.com/2018/08/the-curated-home-grant-gibson-2.jpeg" style="width:100%" alt="example" onclick="expand(this);on();">
    <img src="https://www.pagodared.com/blog/wp-content/uploads/2018/05/4-Mark_D_Sikes_Beverly_Hills_1.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://content.thriveglobal.com/wp-content/uploads/2019/03/GettyImages-999732712.jpg" style="width:100%" alt="example" onclick="expand(this);on();">
  </div>
  <div class="column">
    <img src="https://www.chitkara.edu.in/wp-content/uploads/2019/02/INTERIOR-DESIGN1.jpg" style="width:100%" alt="example" onclick="expand(this);on();">
    <img src="https://static1.squarespace.com/static/54eb4c37e4b07c3f6564f207/54eb4f16e4b07c01c5c411b1/54ef5ecbe4b025105a4f6948/1424973516099/Livingroom+2.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://www.hometown.in/design-build/static/slider-1b.4ec10847.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://industryreports24.com/wp-content/uploads/2019/04/Interior-Design.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://lifetimeluxury.com/wp-content/uploads/2017/12/Interior-Design-Room.jpg" style="width:100%" alt="example" onclick="expand(this);on();">
    <img src="https://cdn.styleblueprint.com/wp-content/uploads/2019/02/MurphyMaude-Watson-SelaviePhoto-31.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
 <img src="https://hgtvhome.sndimg.com/content/dam/images/hgtv/fullset/2012/2/1/0/CI-Thibaut_Barrowgate-living-room-wallpaper-settee_s3x4.jpg.rend.hgtvcom.616.822.suffix/1400965159581.jpeg" style="width:100%" alt="example" onclick="expand(this); on();">
</div>
  <div class="column">
    <img src="https://www.sbid.org/wp-content/uploads/2018/02/img7-e1517585569791.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="http://www.sb-id.com/uploads/highlights/8_swissvilla.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="http://www.contemporist.com/wp-content/uploads/2019/03/modern-cafe-restaurant-interior-design-020319-726-01-800x420.jpg" style="width:100%"  alt="example" onclick="expand(this); on();">
    <img src="http://www.imgnyc.com/wp-content/uploads/2018/06/poster-mspt-time-lapse-v3.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://i.pinimg.com/736x/89/dc/1d/89dc1d70c121e8ab81b81f601b581a04.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://super.homelane.com/ogimage-2.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
    <img src="https://media.architecturaldigest.com/photos/5744d37dff9db5a43d5cf9c6/master/w_2626,h_1905,c_limit/contemporary-interior-design-004.jpg" style="width:100%" alt="example" onclick="expand(this); on();">
  </div>
</div>


<div id="overLay"></div>



<div class="container">
  <span onclick="this.parentElement.style.display='none'; off()" class="closebtn">&times;</span>
  <img id="expandedImg" style="width:100%">
  <div id="imgtext"></div>
</div>


<script>
function expand(imgs) """),format.raw/*308.23*/("""{"""),format.raw/*308.24*/("""
  """),format.raw/*309.3*/("""var expandImg = document.getElementById("expandedImg");


  var imgText = document.getElementById("imgtext");
  expandImg.src = imgs.src;
  imgText.innerHTML = imgs.alt;
  expandImg.parentElement.style.display = "block";
"""),format.raw/*316.1*/("""}"""),format.raw/*316.2*/("""

"""),format.raw/*318.1*/("""function on() """),format.raw/*318.15*/("""{"""),format.raw/*318.16*/("""
  """),format.raw/*319.3*/("""document.getElementById("overLay").style.display = "block";
"""),format.raw/*320.1*/("""}"""),format.raw/*320.2*/("""

"""),format.raw/*322.1*/("""function off() """),format.raw/*322.16*/("""{"""),format.raw/*322.17*/("""
  """),format.raw/*323.3*/("""document.getElementById("overLay").style.display = "none";
"""),format.raw/*324.1*/("""}"""),format.raw/*324.2*/("""

"""),format.raw/*326.1*/("""</script>

</body>
</html>

""")))}),format.raw/*331.2*/("""
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
                  DATE: Sun Apr 28 14:30:43 CDT 2019
                  SOURCE: /users/sliu/webApp/InteriorDesign-WebApps-S19/server/app/views/anotherGallery.scala.html
                  HASH: 6116df0213f080f5c7be03435514d68e68af275f
                  MATRIX: 839->26|869->48|908->50|936->52|1084->172|1113->173|1143->176|1644->650|1672->651|1702->654|1731->656|1759->657|1789->660|1840->684|1868->685|1897->687|1929->692|1957->693|1987->696|2070->752|2098->753|2127->755|2162->763|2191->764|2221->767|2299->818|2327->819|2356->821|2388->826|2416->827|2446->830|2596->953|2624->954|2653->956|2750->1026|2779->1027|2809->1030|2894->1088|2922->1089|2951->1091|2991->1103|3020->1104|3050->1107|3120->1150|3148->1151|3177->1153|3233->1182|3261->1183|3291->1186|3438->1306|3466->1307|3495->1309|3534->1320|3563->1321|3593->1324|3644->1348|3672->1349|3701->1351|3741->1363|3770->1364|3800->1367|3867->1407|3895->1408|3924->1410|3961->1419|3990->1420|4020->1423|4354->1730|4382->1731|4410->1732|4456->1750|4485->1751|4515->1754|4594->1805|4623->1806|4653->1808|4730->1856|4760->1857|4791->1860|4865->1906|4894->1907|4924->1909|5000->1956|5030->1957|5061->1960|5325->2196|5354->2197|5384->2199|5449->2235|5479->2236|5510->2239|5620->2321|5649->2322|5678->2323|5765->2381|5795->2382|5826->2385|5956->2487|5985->2488|6015->2490|6051->2498|6081->2499|6112->2502|6221->2583|6250->2584|6280->2586|6350->2627|6380->2628|6411->2631|6559->2751|6588->2752|6618->2754|6686->2793|6716->2794|6747->2797|6808->2830|6837->2831|6867->2833|6933->2870|6963->2871|6994->2874|7281->3133|7310->3134|7340->3136|7470->3237|7500->3238|7531->3241|7582->3264|7611->3265|7641->3267|7731->3328|7761->3329|7792->3332|7957->3469|7986->3470|8016->3472|8098->3525|8128->3526|8159->3529|8304->3646|8333->3647|8363->3649|8480->3737|8510->3738|8541->3741|8596->3768|8625->3769|8655->3771|8756->3843|8786->3844|8817->3847|8864->3866|8893->3867|8923->3869|8962->3879|8992->3880|9022->3882|9062->3894|9091->3895|9121->3897|9157->3905|9187->3906|9218->3909|9290->3953|9319->3954|9348->3955|9396->3974|9426->3975|9457->3978|9504->3997|9533->3998|9564->4001|14060->8468|14090->8469|14121->8472|14370->8693|14399->8694|14429->8696|14472->8710|14502->8711|14533->8714|14621->8774|14650->8775|14680->8777|14724->8792|14754->8793|14785->8796|14872->8855|14901->8856|14931->8858|14991->8887
                  LINES: 26->3|26->3|26->3|28->5|35->12|35->12|36->13|47->24|47->24|50->27|50->27|50->27|51->28|52->29|52->29|54->31|54->31|54->31|55->32|57->34|57->34|59->36|59->36|59->36|60->37|63->40|63->40|65->42|65->42|65->42|66->43|71->48|71->48|73->50|74->51|74->51|75->52|78->55|78->55|80->57|80->57|80->57|81->58|83->60|83->60|85->62|86->63|86->63|87->64|93->70|93->70|95->72|95->72|95->72|96->73|97->74|97->74|99->76|99->76|99->76|100->77|102->79|102->79|104->81|104->81|104->81|105->82|119->96|119->96|120->97|120->97|120->97|121->98|123->100|123->100|125->102|126->103|126->103|127->104|130->107|130->107|132->109|133->110|133->110|134->111|148->125|148->125|150->127|151->128|151->128|152->129|157->134|157->134|158->135|159->136|159->136|160->137|166->143|166->143|168->145|168->145|168->145|169->146|173->150|173->150|175->152|176->153|176->153|177->154|184->161|184->161|186->163|187->164|187->164|188->165|190->167|190->167|192->169|193->170|193->170|194->171|202->179|202->179|204->181|205->182|205->182|206->183|207->184|207->184|209->186|210->187|210->187|211->188|217->194|217->194|219->196|220->197|220->197|221->198|228->205|228->205|230->207|231->208|231->208|232->209|234->211|234->211|236->213|237->214|237->214|238->215|240->217|240->217|242->219|242->219|242->219|243->220|244->221|244->221|246->223|246->223|246->223|247->224|251->228|251->228|252->229|252->229|252->229|253->230|254->231|254->231|257->234|331->308|331->308|332->309|339->316|339->316|341->318|341->318|341->318|342->319|343->320|343->320|345->322|345->322|345->322|346->323|347->324|347->324|349->326|354->331
                  -- GENERATED --
              */
          