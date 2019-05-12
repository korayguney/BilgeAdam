package com.bilgeadam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/control")
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String generatedcapt = request.getSession().getAttribute("capt").toString();
	String sentcapt = request.getParameter("captcha");
	
	if(generatedcapt.equals(sentcapt)) {
		request.getRequestDispatcher("allowed.html").forward(request, response);
	} else {
		request.getRequestDispatcher("notallowed.html").forward(request, response);
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
