package com.bilgeadam.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.models.User;
import com.bilgeadam.utils.DBUtils;
import com.bilgeadam.utils.HashAlgorithm;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		User user = new User(username,password);
		
		boolean result = new UserDAO().isUserOnDB(user);
		
		System.out.println("Result : "  + result);
		
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			//request.setAttribute("gender", "M");
			
			request.getRequestDispatcher("/secure/successlogin.jsp").forward(request, response);
			
		} else {
			response.sendRedirect("index.html");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
