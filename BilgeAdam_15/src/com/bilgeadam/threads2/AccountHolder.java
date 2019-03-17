package com.bilgeadam.threads2;

public class AccountHolder implements Runnable {

	Account account;

	public AccountHolder(Account account) {
		this.account = account;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 4; i++) {
			makeWithDraw(2000);
			if (account.getBalance() <= 0) {
				System.out.println("Account is 0 !!!");
			}
		}

	}

	private void makeWithDraw(int withdrawamount) {

		if (account.getBalance() >= withdrawamount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw $ " + withdrawamount);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(withdrawamount);

			System.out.println(Thread.currentThread().getName() + " is completed withdraw $ " + withdrawamount);

		} else {
			System.out.println(Thread.currentThread().getName() + " does not have enough balance at account : "
					+ account.getBalance());
		}

	}

}
