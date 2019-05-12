package com.bilgeadam.servlets;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gencapt")
public class GenerateCaptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String chars = "abcdefghijklmnoprstuvyzxqw123456789";
		Random random = new Random();
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			char c = chars.toCharArray()[random.nextInt(chars.length())];
			str.append(c);
		}
		
		request.getSession().setAttribute("capt", str.toString());
		
		BufferedImage bufferedImage = new BufferedImage(100, 25, BufferedImage.TYPE_INT_RGB);
		Graphics2D pen = (Graphics2D) bufferedImage.getGraphics();
		pen.setColor(Color.RED);
		pen.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
		
		pen.setColor(Color.BLACK);
		pen.setFont(new Font("Arial", Font.BOLD, 19));
		pen.drawString(str.toString(), 10, 20);
		
		response.setContentType("image/jpeg");
		ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
