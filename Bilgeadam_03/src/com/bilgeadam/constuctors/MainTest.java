package com.bilgeadam.constuctors;

public class MainTest {

	public static void main(String[] args) {
		
		VipCustomer vipCustomer = new VipCustomer("aaa bbb", "ccc@ddd.com");
		double credit = vipCustomer.getCreditLimit();
		System.out.println(credit);
		
	}

}
