package com.bilgeadam.jframe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameExample {

	public static void main(String[] args) {

		JFrame jframe = new JFrame();
		
		String firstname = JOptionPane.showInputDialog(jframe, "Please enter your name :");
		
		if (firstname.isEmpty()) {
			JOptionPane.showMessageDialog(jframe, "Name section can not be empty!");
		} else {
			String password = JOptionPane.showInputDialog(jframe, "Please enter your password :");
			
			if (password.length() == 0) {
				JOptionPane.showMessageDialog(jframe, "Password section can not be empty!");
			} else {
				JOptionPane.showMessageDialog(jframe, "Welcome " + firstname);
			}
			
		}
		
		
	}

}
