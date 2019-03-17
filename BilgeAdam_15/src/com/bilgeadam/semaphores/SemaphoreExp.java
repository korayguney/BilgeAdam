package com.bilgeadam.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreExp {

	static Semaphore semaphore = new Semaphore(1);

	static class MyATMExample extends Thread {

		private String name = "";

		public MyATMExample(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			try {

				System.out.println(name + " : aquiring lock...");
				System.out.println(name + " : avaible semaphore permits " + semaphore.availablePermits());

				semaphore.acquire();
				System.out.println(name + " : aquire the lock!");

				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println(name + " : is operation now, the available semaphore permits are "
								+ semaphore.availablePermits());
						Thread.sleep(500);
					}
				} finally {
					semaphore.release();
					System.out.println(name + " : releasing lock...");
					System.out.println(name + " : avaible semaphore permits " + semaphore.availablePermits());
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("TOTAL available semaphore permits " + semaphore.availablePermits());
		
		MyATMExample atm_example1= new MyATMExample("A");
		atm_example1.start();
		
		MyATMExample atm_example2= new MyATMExample("B");
		atm_example2.start();
		
		MyATMExample atm_example3= new MyATMExample("C");
		atm_example3.start();
		
		MyATMExample atm_example4= new MyATMExample("D");
		atm_example4.start();
		
		MyATMExample atm_example5= new MyATMExample("E");
		atm_example5.start();
		
		MyATMExample atm_example6= new MyATMExample("F");
		atm_example6.start();
		
	}
}
