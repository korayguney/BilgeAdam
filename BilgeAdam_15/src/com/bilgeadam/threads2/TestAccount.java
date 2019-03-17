package com.bilgeadam.threads2;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account();
		AccountHolder accountHolder1 = new AccountHolder(account);
		Thread firstThread = new Thread(accountHolder1);
		Thread secondThread = new Thread(accountHolder1);
		
		firstThread.setName("Koray ");
		secondThread.setName("Umut ");
		
		firstThread.start();
		secondThread.start();
		
		try {
			firstThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
