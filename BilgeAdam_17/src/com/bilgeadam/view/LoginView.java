package com.bilgeadam.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import com.bilgeadam.controller.LoginService;
import com.bilgeadam.model.User;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginView {

	private JFrame frame;
	private JTextField txt_username;
	private JTextField txt_password;
	private User user = new User();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblUsername.setBounds(73, 191, 216, 51);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblPassword.setBounds(73, 275, 216, 51);
		frame.getContentPane().add(lblPassword);
		
		txt_username = new JTextField();
		txt_username.setBounds(313, 191, 229, 51);
		frame.getContentPane().add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JTextField();
		txt_password.setColumns(10);
		txt_password.setBounds(313, 275, 229, 51);
		frame.getContentPane().add(txt_password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				user.setUsername(txt_username.getText());
				user.setPassword(txt_password.getText());
				
				checkUser(user.getUsername(), user.getPassword());
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnLogin.setBounds(313, 372, 116, 37);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kgb20\\Desktop\\bilgeadamlogo.jpg"));
		lblNewLabel.setBounds(241, 13, 312, 177);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new SignupView().main(null);
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSignUp.setBounds(441, 372, 141, 37);
		frame.getContentPane().add(btnSignUp);
	}

	protected void checkUser(String username, String password) {
		boolean result = new LoginService().validateUser(username,password);
		System.out.println(result);
		if(result) {
			JOptionPane.showMessageDialog(null, "Welcome " + username);
		} else {
			JOptionPane.showMessageDialog(null, "Please check your login credentials " + username);
		}
		
	}
}
