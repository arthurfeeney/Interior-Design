/**
 * 
 */
//import org.scalajs.jquery._
//$("h1").css("color", "red")
//document.getElementById("head").style.color = "red";

let mod = false;

function expand(imgs) {
	if(mod === false){
	  var expandImg = document.getElementById("expandedImg");
	  var imgText = document.getElementById("imgtext");
	  expandImg.src = imgs.src;
	  imgText.innerHTML = imgs.alt;
	  expandImg.parentElement.style.display = "block";
	}
}

function on() {
	if(mod === false){
		document.getElementById("overLay").style.display = "block";
	}
}

function off() {
  document.getElementById("overLay").style.display = "none";
}

document.getElementById("myBtn").style.display = "none"


$("#delete").click(function() {
	alert( "Handler for .click() called." );
});

var modal = document.getElementById('myModal');



//Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];



//When the user clicks on <span> (x), close the modal
span.onclick = function() {
	modal.style.display = "none";
	mod = false;
	$("#modify").css("color", "#fff");

}

//When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
	if (event.target == modal) {
		mod = false;
		$("#modify").css("color", "#fff");
		modal.style.display = "none";
	}
}

$("#modify").click(function() {
	$(this).css("color", "red");
	mod = true;
})
function modifyWindow() {
	if(mod === true){
		modal.style.display = "block";
		console.log($(this).attr("value"))
		$(this).css("color", "red");
	}
}

function filterByDesc(desc) {
	let imgsrc = "/images/"+desc;
	$.getJSON(imgsrc).done(function(data) {
		$("#c1").empty();
		$("#c2").empty();
		$("#c3").empty();
		$.each(data, function(i, item) {
			if(i%3 === 1){
				$("<img>").attr({"src": item, "class": "column", "style": "width: 100%", "onclick": "expand(this); on()"}).appendTo("#c1");
			} else if(i%3 === 2){
				$("<img>").attr({"src": item, "class": "column", "style": "width: 100%", "onclick": "expand(this); on()"}).appendTo("#c2");
			} else if(i%3 === 0){
				$("<img>").attr({"src": item, "class": "column", "style": "width: 100%", "onclick": "expand(this); on()"}).appendTo("#c3");
			}
		});
	});	
}

function loadGallery() {
	let imgsrc = "/loadGallery";
	$.getJSON(imgsrc).done(function(data) {
		$("#c1").empty();
		$("#c2").empty();
		$("#c3").empty();
		$.each(data, function(i, item) {
			if(i%3 === 1){
				console.log("Div 1 "+item.imglink)
				$("<img>").attr({"src": item.imglink,"value":"6", "class": "column", "style": "width: 100%", "onclick": "expand(this); on(); modifyWindow()"}).appendTo("#c1");
			} else if(i%3 === 2){
				console.log("Div 2 "+item.imglink)
				$("<img>").attr({"src": item.imglink, "value":item.colnum+":"+item.rownum+":"+item.id+":"+item.description ,"class": "column", "style": "width: 100%", "onclick": "expand(this); on(); modifyWindow()"}).appendTo("#c2");
				//$("<img>").attr("src", item.imglink).appendTo("#c2");
			} else if(i%3 === 0){
				console.log("Div 3 "+item.imglink)
				$("<img>").attr({"src": item.imglink, "value":item.colnum+":"+item.rownum+":"+item.id+":"+item.description ,"class": "column", "style": "width: 100%", "onclick": "expand(this); on(); modifyWindow();"}).appendTo("#c3");
				//$("<img>").attr("src", item.imglink).appendTo("#c3");
			}
		});
	});	
}

loadGallery();
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
