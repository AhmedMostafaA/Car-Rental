package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.entities.Customer;
import com.mybatis.entities.CustomerAddress;
import com.mybatis.main.Active;


/**
 * Servlet implementation class Registers
 */
@WebServlet("/Registers")
public class Registers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registers() {
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
		
		String day = request.getParameter("day");
		String month = request.getParameter("month");
		String year =  request.getParameter("year");

		
				
		Active a = new Active();
		
		CustomerAddress ca = new CustomerAddress();
		ca.setCityName(request.getParameter("cite"));
		ca.setPhoneNumber(Integer.parseInt(request.getParameter("phone")));
		ca.setPostalCode(Integer.parseInt(request.getParameter("postalcode")));
		ca.setStreetName(request.getParameter("streetName"));
		ca.setStreetNumber(Integer.parseInt(request.getParameter("streetNum")));
		
		ca.setCid(a.setCustAdd(ca));
		
		
		Customer c = new Customer();
		c.setCustomerType("privte");
		c.setDateOfBirth(year+"-"+month+"-"+day);
		c.setEmail(request.getParameter("email"));
		c.setFirstName(request.getParameter("name"));
		c.setGender(Boolean.valueOf(request.getParameter("male")));
		c.setLoginName(request.getParameter("loginName"));
		c.setNationality(request.getParameter("nationality"));
		c.setPassword(request.getParameter("password"));
		c.setCustomerAdd(ca);
		
		a.setCust(c);
		
		
	}

}
