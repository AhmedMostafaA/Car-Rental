<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@page import="com.mybatis.entities.Car"%>

	<%
		Car c = (Car) request.getAttribute("car");
	%>
<script>
$(document).ready(function(){
    $("#btn").click(function(){
   	 
   	 $.post("BookingServ",
        {
          sday: $("#sday").val(),
          smonth: $("#smonth").val(),
          syear :$("#syear").val(),
          eday: $("#eday").val(),
          emonth: $("#emonth").val(),
          eyear: $("#eyear").val(),
          carid:<%=c.getId()%>,
        },
        function(data,status){
        	$("#div1").html(data);
        	
        });
    });
});
</script>

<style>
.myButton {
	-moz-box-shadow: 0px 0px 0px 2px #9dabcf;
	-webkit-box-shadow: 0px 0px 0px 2px #9dabcf;
	box-shadow: 0px 0px 0px 2px #9dabcf;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #7892c2
		), color-stop(1, #476e9e));
	background: -moz-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background: -webkit-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background: -o-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background: -ms-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background: linear-gradient(to bottom, #7892c2 5%, #476e9e 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#7892c2',
		endColorstr='#476e9e', GradientType=0);
	background-color: #7892c2;
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	border-radius: 10px;
	border: 1px solid #4e6096;
	display: inline-block;
	cursor: pointer;
	color: #ffffff;
	font-family: Arial;
	font-size: 19px;
	padding: 3px 37px;
	text-decoration: none;
	text-shadow: 0px 1px 0px #283966;
}

.myButton:hover {
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0.05, #476e9e
		), color-stop(1, #7892c2));
	background: -moz-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background: -webkit-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background: -o-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background: -ms-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background: linear-gradient(to bottom, #476e9e 5%, #7892c2 100%);
	filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#476e9e',
		endColorstr='#7892c2', GradientType=0);
	background-color: #476e9e;
}

.myButton:active {
	position: relative;
	top: 1px;
}

body, html {
	color: #373C40;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 120%;
	height: 100%;
	background-color: #2F2F2E;
}

.reg {
	width: 800px;
	margin: 30px auto 0px auto;
	height: 530px;
	background-color: white;
	padding: 5px;
}
</style>
</head>
<body>

	<div class="reg" style="margin-left: 100px;">
		<img src="<%=c.getLink()%>" alt="Mountain View"
			style="margin-left: auto; margin-right: auto; display: block; width: 304px; overflow: hidden; white-space: nowrap; height: 228px;">

		<form style="margin-left: auto; margin-right: auto;">
			<p>
				<label>Start Date * </label> <select id="sday">
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select> <select id="smonth">
					<option value="01">January</option>
					<option value="02">February</option>
					<option value="03">March</option>
					<option value="04">April</option>
					<option value="05">May</option>
					<option value="06">June</option>
					<option value="07">July</option>
					<option value="08">August</option>
					<option value="09">September</option>
					<option value="10">October</option>
					<option value="11">November</option>
					<option value="12">December</option>
				</select> <input type="text" size="4" maxlength="4" id="syear" /> e.g 2015
			</p>
			<p>
				<label>End Date * </label> <select id="eday">
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select> <select id="emonth">
					<option value="01">January</option>
					<option value="02">February</option>
					<option value="03">March</option>
					<option value="04">April</option>
					<option value="05">May</option>
					<option value="06">June</option>
					<option value="07">July</option>
					<option value="08">August</option>
					<option value="09">September</option>
					<option value="10">October</option>
					<option value="11">November</option>
					<option value="12">December</option>
				</select> <input type="text" size="4" maxlength="4" id="eyear" /> e.g 2016
			</p>
			<p>
				<label>Car price per day :</label> <label><%=c.getBasePricePerDay()%></label>
			</p>
			<p>
				<label>Car id :</label> <label id="carid"><%=c.getId()%></label>
			</p>
			<input type="submit" value="Done" class="myButton" id="btn" />
		</form>
	</div>
</body>
</html>