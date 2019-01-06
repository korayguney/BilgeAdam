package com.bilgeadam.aggregaitoncomposition;

public class Student {

	private int stu_no;
	private String fullname;
	private long citizen_no;
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int stu_no, String fullname, Address address) {
		super();
		this.stu_no = stu_no;
		this.fullname = fullname;
		this.address = address;
	}
	
	
	public Student(int stu_no, String fullname, long citizen_no, Address address) {
		super();
		this.stu_no = stu_no;
		this.fullname = fullname;
		this.citizen_no = citizen_no;
		this.address = address;
	}

	
	public String getinfo() {
		return String.format("Student : no: %d , fullname : %s , citizen no : %d , %s ", stu_no ,fullname, citizen_no, address.getInfo());
	}
	
	

	public int getStu_no() {
		return stu_no;
	}


	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public long getCitizen_no() {
		return citizen_no;
	}


	public void setCitizen_no(long citizen_no) {
		this.citizen_no = citizen_no;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	
}
