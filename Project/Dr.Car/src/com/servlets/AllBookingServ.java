package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class AllBookingServ
 */
@WebServlet("/AllBookingServ")
public class AllBookingServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllBookingServ() {
    	
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
		
		System.out.println("allbooking...........");
		Active a  = new Active();
		
		HttpSession session = request.getSession();
		Customer c  = (Customer)session.getAttribute("user");
		
		if(c == null)
		{
			System.out.println("null......");
			RequestDispatcher d = request.getRequestDispatcher("error.html");
			d.forward(request, response);
		}
		List<Booking> b = a.getAllBooking(c.getId());
		
		PrintWriter out = response.getWriter();
		 out.println(""
		 		+ "<!DOCTYPE html>"
		 		+ "<html>"
		 		+ "<head>"
		 		+ "</head>"
		 		+ "<body>"
		 		+ "<div style='width:800px;height:530px; color:white'>"
		 		+ "<h1 style='text-align:center;'>YOUR RENTAL</h1>");
		 
		 		for(int i=0 ; i<b.size() ; i++)
		 		{
		 			out.println( //"<div class='cities'>"
		 					"<div>"
		 					+"<img width=100 height=70 style='float: left; display: block;' src='"+a.getcar(b.get(i).getIdCar()).getLink()+"'/>"
		 					+ "<h4> Start Date : "+b.get(i).getBookingDate()+"<br>End Date : "+b.get(i).getReturnDate()+"</h4></div>");
		 		}
		 		out.println( "</div></body>"
		 		+ "</html>");
	}

}
