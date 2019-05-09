/**
 * 
 */
//import org.scalajs.jquery._
//$("h1").css("color", "red")
//document.getElementById("head").style.color = "red";

$("#delete").click(function() {
	alert( "Handler for .click() called." );
});
//$("#delete").css("color", "red");

function filterByDesc(desc) {
	let imgsrc = "/images/"+desc;
	$.getJSON(imgsrc).done(function(data) {
		$("#c1").empty();
		$("#c2").empty();
		$("#c3").empty();
		$.each(data, function(i, item) {
			if(i%3 === 1){
				$("<img>").attr("src", item).appendTo("#c1");
			} else if(i%3 === 2){
				$("<img>").attr("src", item).appendTo("#c2");
			} else if(i%3 === 0){
				$("<img>").attr("src", item).appendTo("#c3");
			}
		});
	});	
}

//console.log("Hello")
$("#outdoor").click(function() {filterByDesc("indoor")});
$("#indoor").click(function() {filterByDesc("outdoor")});
$("#before").click(function() {filterByDesc("before")});
$("#after").click(function() {filterByDesc("after")});
//$("#indoor").on("click", filterByDesc("indoor"));
//	$.ajax({
//		  type: 'GET', 
//		  url: "/images/indoor",
//		  dataType: 'json',
//		  contentType: 'json',
//		  headers: { 'api-key':'myKey' }
////		  success: onSuccess,
////		  error: onFailure
//		});
//	



//const field = document.getElementById("av-year")
////const text = document.getElementById("text-for-av-temp")
//
//field.onkeydown = (event) => {
//	if(event.key ==='Enter') {
//		const year = field.value;
////		fetch("/averageYearlyHigh/"+year).then(response => {
////			return response.text();
////		}).then(res => {
////			text.innerHTML = res
////		});
//		//$("#text-for-av-temp").load("/averageYearlyHigh/"+year)
//	}
//}
//
//$("#contact").onClick => {
//	$("#PageContent").load("views.html.contact")
//	
//}
