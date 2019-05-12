package com.bilgeadam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.models.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String captcha = request.getParameter("captcha");

		if (!request.getSession(false).getAttribute("capt").equals(captcha)) {

			request.setAttribute("error", "Your captcha input does not matched");
			request.getRequestDispatcher("/index").forward(request, response);

		} else {

			User user = new User(username, password);

			if (username.isEmpty() || password.isEmpty()) {
				request.setAttribute("error", "You have to fill all the sections");
				request.getRequestDispatcher("/index").forward(request, response);
			} else {
				boolean result = new UserDAO().isUserOnDB(user);

				if (result) {
					request.getSession(false).setAttribute("username", username);
					request.getRequestDispatcher("/index").forward(request, response);
				} else {
					request.setAttribute("error", "There is no such a user on the DB");
					request.getRequestDispatcher("/index").forward(request, response);
				}

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
