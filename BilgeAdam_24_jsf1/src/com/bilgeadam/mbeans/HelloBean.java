package com.bilgeadam.mbeans;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class HelloBean {

	private String text = " the real world of JSF";
	private String text1="";

	
	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void sayHello() {
		//return this.text1; 
	}


}
