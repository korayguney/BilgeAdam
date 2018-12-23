package com.bilgeadam.forloop;

public class ForLoopBreakOutherExample {

	public static void main(String[] args) {
		
		outer:
		for (int i = 1; i < 50; i++) {
			
			System.out.println("i : " + i );
			
			for (int j = 1; j < 20; j++) {
				System.out.println("\tj : " + j );
				break outer;
			}
		}
	}

}
