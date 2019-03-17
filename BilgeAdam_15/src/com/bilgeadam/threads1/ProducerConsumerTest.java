package com.bilgeadam.threads1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import threads.ThreadColor;

public class ProducerConsumerTest {

	private static int value;
	private static int value2;
	private static String flag="";
	
	static Lock lock = new ReentrantLock();
	
	private static void increment() {
			lock.lock();
			value2++;
			lock.unlock();
	}

	private static void decrement() {
//		synchronized (flag) {
//			value--;
//		}
		lock.lock();
		try {
			value2--;
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		
		Thread incrementThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (value =0; value <= 5; ++value) {
//					increment();
					System.out.println(ThreadColor.ANSI_PURPLE+Thread.currentThread().getName()+" : " + value);
				}
			}
		}, "increment ");
		
		Thread decrementThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				if(value==5) {
					for (value =5; value <= 10; ++value) {
//					decrement();
						System.out.println(ThreadColor.ANSI_WHITE+Thread.currentThread().getName()+" : " + value);
					}
				}
			}
		},"decrement ");
		
		incrementThread.start();
		decrementThread.start();
		
	}
}
