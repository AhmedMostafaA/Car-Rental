$(document).ready(function() {
	$("#log").click(function() {
		$("#div1").load("login.html");
	});

	$("#reg").click(function() {
		$("#div1").load("registeration.html");
	});

	$("#rent").click(function() {
		$("#div1").load("rentCar.html");
	});
	
	$("#checkrent").click(function() {
		$("#div1").load("AllBookingServ");
	});
});

