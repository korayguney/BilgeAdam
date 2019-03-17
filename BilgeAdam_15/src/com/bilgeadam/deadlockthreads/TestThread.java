package com.bilgeadam.deadlockthreads;

public class TestThread {

	static Object lock1 = new Object();
	static Object lock2 = new Object();
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
	}
	
	private static class Thread1 extends Thread {
		
		@Override
		public void run() {
			
			synchronized (lock1) {
				
				System.out.println("Thread 1 : Holding Lock 1...");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 1 : Waiting for Lock 2...");
				synchronized (lock2) {
					System.out.println("Thread 1 : Acquire Lock 2...");
				}
			}
		}
	}
	
	private static class Thread2 extends Thread {
		
		@Override
		public void run() {
			
			synchronized (lock1) {
				
				System.out.println("Thread 2 : Holding Lock 2...");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 2 : Waiting for Lock 1...");
				synchronized (lock2) {
					System.out.println("Thread 2 : Acquire Lock 1...");
				}
			}
		}
	}
	
}
