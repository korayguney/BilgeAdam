package com.bilgeadam.threadsjoins;

import java.util.concurrent.TimeUnit;

public class JoinExample {

	public static void main(String[] args) {

		ParentClass parent = new JoinExample().new ParentClass();
		parent.start();

	}

	class ParentClass extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println("Parent thread : " + i);

				try {
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (i == 50) {
					ChildClass child = new ChildClass();
					child.start();

//					try {
//						child.join();
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}

			}

		}
	}

	class ChildClass extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
				System.out.println("\tChild thread : " + i);

				try {
					TimeUnit.MILLISECONDS.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
