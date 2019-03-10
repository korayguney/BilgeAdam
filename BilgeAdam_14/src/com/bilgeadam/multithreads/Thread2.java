package com.bilgeadam.multithreads;

import java.lang.management.ManagementFactory;

public class Thread2 {

	public static void main(String[] args) {

//		Thread2.MyThread threahd1 = new Thread2().new MyThread();

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() +" : " + i);
					try {
						if(i==50)
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		});

		thread.setName("My Custom Thread");
		thread.start();

		// display current thread count
		System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());
		

	}

//	class MyThread implements Runnable {
//
//		@Override
//		public void run() {
//			for (int i = 0; i < 100; i++) {
//				System.out.println(" i : " + i);
//			}
//		}
//
//	}

}
