package com.bilgeadam.constuctors;

public class VipCustomer {

	String name;
	double creditLimit;
	String email;
	
	public VipCustomer() {
		//this("asas", 6565, "dsadasdsa");
		this.name = "dsdasdas";
		this.creditLimit = 545454;
		this.email = "fassdfafas";
	}
	
	public VipCustomer(String name, String email) {
		this(name, 5800.45, email);
//		this.name = name;
//		this.email = email;
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	
	
}
