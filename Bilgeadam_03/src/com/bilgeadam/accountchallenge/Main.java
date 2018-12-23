package com.bilgeadam.accountchallenge;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Account account = new Account();
		account.setBalance(5845.50);
		account.setCustomerName("Jon Smith");
		account.setAccountNumber(123456);
//		double balance = account.getBalance();
//		System.out.println("Balance of the customer :" + balance);

//		account.depositFunds(2564.89);
//		account.withdrawFunds(5000.00);
//		account.withdrawFunds(5000.00);

//		JFrame jframe = new JFrame();
//
//		String funds = JOptionPane.showInputDialog(jframe, "Please enter balance which you want to withdraw:");
//		double withdrawalfunds = Double.valueOf(funds);
//		account.withdrawFunds(withdrawalfunds);
		
		Account account2 = new Account(585522, 2500.50, "Ahmet Mehmet", "ahmet@hotmail.com", "(212) 555 6677");
		
		System.out.println(account2.getEmail());
		
		Account account3 = new Account("Koray Guney", "kg@gmail.com", "555666444");
		System.out.println(account3.getBalance());;
		
		
		
	}

}
