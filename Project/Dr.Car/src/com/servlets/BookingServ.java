package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mybatis.entities.Booking;
import com.mybatis.entities.Customer;
import com.mybatis.main.Active;

/**
 * Servlet implementation class BookingServ
 */
@WebServlet("/BookingServ")
public class BookingServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("bookingServ welcom post");
		Booking b = new Booking();
		Active a = new Active();
		
		String sd  = request.getParameter("sday");
		String sm  = request.getParameter("smonth");
		String sy  = request.getParameter("syear");
		
		String ed  = request.getParameter("eday");
		String em  = request.getParameter("emonth");
		String ey  = request.getParameter("eyear");
		
		int carid = Integer.parseInt(request.getParameter("carid"));
		
		b.setBookingDate(sy+"-"+sm+"-"+sd);
		b.setReturnDate(ey+"-"+em+"-"+ed);
		
		b.setIdCar(a.getcar(carid).getId());
		
		HttpSession session = request.getSession();
		Customer c  = (Customer)session.getAttribute("user");
		
		b.setIdCustomer(c.getId());
		
		a.setbook(b);
		
		RequestDispatcher rd = request.getRequestDispatcher("rentCar.html");
		rd.forward(request, response);
		 
	}

}
