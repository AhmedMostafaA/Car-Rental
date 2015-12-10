DR.Car
=======

Car Rent webstite.
_____________________
tools are used:
	- Mysql
	- Mybatis
	- servlets
	- jsp
	- html
	- javascript
	- css
	- jquery
	- ajax (call)
	- bootstrap
	- jqwidgets


______________________________
How to read the project


Data Base folder:
------------------
content: model and database.
using : Mysql


Dr.car folder:
----------------
this the project
by eclipse (web dynamic)

src :  mybatis: (reslt mapping (to set and get data from database))
		entities: beans of tables.
		main 	: manage data from/to database and connection.
		mapper 	: result mapping (queries).
	
	servlets: control data and pages.
		LoginServ     : check user name and password.
		Registers     : add new customer.
		BookingServ   : add booking to customer.
		AllBookingServ:	get all booking for a customer.
		RentCar       : get a car which customer choose.

webContent : content 	     : all pages.
		main1	     : first page show to customer .
		main 	     : for login/rent car / chrck rental.
		login	     : show in main to login.
		registeration: show in main to registeration.
		rentcar      : to choose car for rent.
		rentinfo     : information about rental.

and have all js,css and images.

_________________________________________________________

1. main1.html page will show.
2. main.html show (if user click on login/rent/check rent).
3. login.html / registeration.html show (click on login).
4. rentcar.html => rentinfo.jsp (click on rent).
5. (click on check_rent) AllBooking(servlet) will return html .
