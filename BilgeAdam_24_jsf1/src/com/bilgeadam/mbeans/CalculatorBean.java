package com.bilgeadam.mbeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculatorBean {
	
	private double firstdigit;
	private double seconddigit;
	private double result;
	
	public void add() {
		this.result = this.firstdigit + this.seconddigit;
	}
	
	public void substract() {
		this.result = Math.abs(this.firstdigit - this.seconddigit);
	}
	
	public void multiply() {
		this.result = this.firstdigit * this.seconddigit;
	}
	
	public void divide() {
		this.result = this.firstdigit / this.seconddigit;
	}
	
	public double getFirstdigit() {
		return firstdigit;
	}
	public void setFirstdigit(double firstdigit) {
		this.firstdigit = firstdigit;
	}
	public double getSeconddigit() {
		return seconddigit;
	}
	public void setSeconddigit(double seconddigit) {
		this.seconddigit = seconddigit;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	

}
