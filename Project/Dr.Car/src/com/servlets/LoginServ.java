package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mybatis.entities.Customer;
import com.mybatis.entities.ObjectLog;
import com.mybatis.main.Active;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
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
		
		System.out.println("login serv");
		ObjectLog o = new ObjectLog();
		o.setUser(request.getParameter("login"));
		o.setPass(Integer.parseInt(request.getParameter("password")));
		
		//System.out.println(o.getUser() +"........."+o.getPass());
		Active a = new Active();
		Customer c = a.Checkuser(o);
		
		 HttpSession session = request.getSession();
		 session.setAttribute("user", c);
		 
		 //System.out.println("go on");
		 request.setAttribute("name", c.getFirstName());
		 RequestDispatcher rd = request.getRequestDispatcher("main.html");
		 rd.forward(request, response);
	}

}
