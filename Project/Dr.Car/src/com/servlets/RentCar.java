package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.entities.Car;
import com.mybatis.main.Active;

/**
 * Servlet implementation class RentCar
 */
@WebServlet("/RentCar")
public class RentCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RentCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int carid = Integer.parseInt(request.getParameter("carid"));
		String carname = request.getParameter("carname");
		
		Active active = new Active();
		Car c = active.getcar(carid);
		
		request.setAttribute("car", c);
		
	
		RequestDispatcher rd = request.getRequestDispatcher("/RentInfo.jsp");
		rd.forward(request, response);
	}

}
