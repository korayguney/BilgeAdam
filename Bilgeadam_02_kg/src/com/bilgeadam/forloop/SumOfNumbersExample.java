package com.bilgeadam.forloop;

public class SumOfNumbersExample {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 0; i <= 20 ; i++) {
			sum = sum +i;
			// sum += i;
			if(i != 20)
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
		}
		
		System.out.print(sum);
		 
	}

}
