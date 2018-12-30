package com.bilgeadam.accountchallenge;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Account {
	
	// Instance variables
	
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	private JFrame jframe = new JFrame();
	
	// Constuctor
	public Account() {
		System.out.println("Default (no-arg) constuctor is called!");
	}
	
	
	public Account(String customerName, String email, String phoneNumber) {
		this(0, 0.0 , customerName, email, phoneNumber);
	}
	
	public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Constuctor with parameters is called!");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	// methods
	
	public void depositFunds(double funds) {
		this.balance += funds;
		JOptionPane.showMessageDialog(jframe, this.customerName + " deposits balance to the account of " + this.accountNumber + " and new balance is " + this.balance);
		//System.out.println(this.customerName + " deposits balance to the account of " + this.accountNumber + " and new balance is " + this.balance);
	}
	
	public void depositFunds(double funds, String phoneNumber) {
		this.balance += funds;
		System.out.println(this.customerName + " deposits balance to the account of " + this.accountNumber + " and new balance is " + this.balance);
	}
	
	
	public void withdrawFunds(double funds) {
		if(funds > this.balance) {
			JOptionPane.showMessageDialog(jframe, "You cannot withdraw " + funds + ". Because your current balance is "+ balance);
			//System.err.println("You cannot withdraw " + funds + ". Because your current balance is "+ balance);
		} else {
			this.balance -= funds;
			//System.out.println(this.customerName + " withdraws balance to the account of " + this.accountNumber + " and new balance is " + this.balance);
			JOptionPane.showMessageDialog(jframe, this.customerName + " withdraws balance to the account of " + this.accountNumber + " and new balance is " + this.balance);
		}
	}
	
	// getter & setter
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// Object class overriden methods
	// ---> toString()
	// ---> hashCode()
	// ---> equals()
	
	
	
	
	
}
