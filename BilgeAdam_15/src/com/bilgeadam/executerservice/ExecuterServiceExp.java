package com.bilgeadam.executerservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import threads.ThreadColor;

public class ExecuterServiceExp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		Thread exampleThread = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//					System.out.println(ThreadColor.ANSI_BLUE + Thread.currentThread().getName() + " : " + i);
//				}
//			}
//		};

		Runnable exampleRunnable = () -> {
			for (int j = 1; j <= 10; j++) {
				System.out.println(ThreadColor.ANSI_RED + Thread.currentThread().getName() + " : " + j);
			}
		};

//		Thread exampleThread2 = new Thread(exampleRunnable);
//		
//		exampleThread.start();
//		exampleThread2.start();

//		ExecutorService excSer = Executors.newSingleThreadExecutor();
//		excSer.execute(exampleRunnable);
//		excSer.shutdown();

//		ExecutorService excSer = Executors.newFixedThreadPool(10);
//		ExecutorService excSer2 = Executors.newCachedThreadPool();
//		excSer.execute(exampleRunnable);
//		excSer.execute(exampleRunnable);
//		excSer.execute(exampleRunnable);
//		
//		excSer.shutdown();
//		
//		try {
//			excSer.awaitTermination(5, TimeUnit.SECONDS);
//			excSer.shutdownNow();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		ExecutorService excSer3 = Executors.newCachedThreadPool();
		Future<Integer> result =  excSer3.submit(new CallableImp());
		int inrResult = result.get().intValue();
		System.out.println("The result is " + inrResult);
		
		excSer3.shutdown();
		
		try {
			excSer3.awaitTermination(5, TimeUnit.SECONDS);
			excSer3.shutdownNow();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static class CallableImp implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			int a =0;
			for (int i = 0; i < 10; i++) {
				a+= i;
			}
			return a;
		}
		
	}
	

}
