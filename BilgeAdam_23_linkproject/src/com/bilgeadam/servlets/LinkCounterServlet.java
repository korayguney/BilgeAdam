package com.bilgeadam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bilgeadam.dao.LinkDAO;

@WebServlet("/viewcounter")
public class LinkCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	String link = request.getParameter("link");
	 	int count = Integer.valueOf(request.getParameter("count"));
	
	 	new LinkDAO().incrementViewCount(link, count);
	 	
	 	response.sendRedirect(link);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
