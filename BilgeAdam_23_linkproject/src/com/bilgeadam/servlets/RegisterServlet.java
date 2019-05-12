package com.bilgeadam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.models.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		if(!password1.equals(password2)) {
			request.setAttribute("error1", "Your passwords are not matched");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} else {
			
			boolean result = new UserDAO().checkIfSameUserOnDB(username);
			
			if(result) {
				request.setAttribute("error1", "There is a user with same username");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			} else {
				
				User user = new User(username, password1);
				int res = new UserDAO().saveUser(user);
				if(res > 0) {
					request.setAttribute("success", "Username is saved!");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				} else {
					request.setAttribute("error1", "There is a problem during saving");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}
			}
			
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
