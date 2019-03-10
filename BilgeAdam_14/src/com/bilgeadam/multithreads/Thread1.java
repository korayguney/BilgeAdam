package com.bilgeadam.multithreads;

import java.lang.management.ManagementFactory;

public class Thread1 {

	public static void main(String[] args) {
		
		Thread1.MyThread threahd1 = new Thread1().new MyThread();
		threahd1.setName("My Custom Thread");
//		threahd1.start();
		threahd1.run();
		
		// display current thread count
		System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());;
		
	}

	class MyThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() +" : " + i);
			}
		}

	}

}
