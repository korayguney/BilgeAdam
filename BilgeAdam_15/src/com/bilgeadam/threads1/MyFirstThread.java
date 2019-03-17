package com.bilgeadam.threads1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import threads.ThreadColor;

public class MyFirstThread {

	private static boolean flag = true;

	public static void main(String[] args) {

		MyCustomThread myFirstThread = new MyCustomThread();
		myFirstThread.setName("Thread");

		MyRunnableThread myRunnableThread = new MyRunnableThread();
		Thread mySecondThread = new Thread(myRunnableThread, "Runnable");
//		mySecondThread.yield();

		mySecondThread.setPriority(Thread.MAX_PRIORITY);
		myFirstThread.setPriority(Thread.MIN_PRIORITY);

		myFirstThread.start();
		mySecondThread.start();
		
		ExecutorService exec = Executors.newFixedThreadPool(1);
		exec.submit(myRunnableThread);
		exec.shutdown();
//		mySecondThread.setDaemon(true);

	}

	static class MyCustomThread extends Thread {

		@Override
		public void run() {
//			while (flag) {
				for (int i = 0; i < 10; i++) {
					System.out.println(ThreadColor.ANSI_CYAN + Thread.currentThread().getName() + " : " + i);
//				yield();
				}
//				flag = false;
//			}
		}
	}

	static class MyRunnableThread implements Runnable {

		@Override
		public void run() {
//			try {
//				TimeUnit.SECONDS.sleep(1);
////				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
				for (int i = 0; i < 10; i++) {
					System.out.println(ThreadColor.ANSI_WHITE + Thread.currentThread().getName() + " : " + i);
				}
		}
	}
}
