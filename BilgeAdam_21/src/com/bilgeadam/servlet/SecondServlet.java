package com.bilgeadam.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String developername = (String)request.getAttribute("developer");
		
		String companyname = getServletContext().getInitParameter("company");
		
		
		response.getWriter().append("<h1>Welcome to Second Servlet</h1>");
		response.getWriter().append("<h1>Welcome to Second Servlet</h1>");
		response.getWriter().append("<h1>Developer : </h1>" + developername);
		response.getWriter().append("<h1>Company : </h1>" + companyname);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
