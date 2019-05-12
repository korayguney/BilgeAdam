package com.bilgeadam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bilgeadam.dao.LinkDAO;
import com.bilgeadam.models.UserLink;

@WebServlet("/postlink")
public class PostLinkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String url = request.getParameter("url");
		
		boolean result = new LinkDAO().isURLonDB(url);
		
		if(result) {
			request.setAttribute("error2", "There is already a URL like this");
			request.getRequestDispatcher("secure/postlink.jsp").forward(request, response);
		} else {
			UserLink userLink = new UserLink();
			userLink.setTitle(title);
			userLink.setPostedlink(url);
			userLink.setUsername(request.getSession().getAttribute("username").toString());
			new LinkDAO().saveLink(userLink);
			
			request.setAttribute("success", "Link is saved to DB");
			request.getRequestDispatcher("secure/postlink.jsp").forward(request, response);
		}
	}

}
