package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDAO;
import db.access.RegisterDB;


public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterDB registerDB = new RegisterDB();
		RegisterDAO registerDAO = new RegisterDAO();
		
		System.out.println("---INSIDE---");
		
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String contactNo = request.getParameter("coNo");
		
		
		
		
		registerDAO.setUname(uname);
		registerDAO.setEmail(email);
		registerDAO.setPassword(password);
		registerDAO.setContactNo(contactNo);
		
		
		
		
		registerDB.insert(registerDAO);
		
		
		
		System.out.println("User Name = " +uname);
		System.out.println("Password = " +password);
		System.out.println("Email = " +email);
		System.out.println("Contacnt No = " +contactNo);
		
		request.getSession().setAttribute("uname", uname);
		request.getSession().setAttribute("emailid", email);
		request.getSession().setAttribute("contact", contactNo);

		response.sendRedirect("success.jsp");
		
	}

}
