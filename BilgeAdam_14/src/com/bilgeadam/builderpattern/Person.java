package com.bilgeadam.builderpattern;

public class Person {

	private String givenName;
	private String surName;
	private int age;
	private Gender gender;
	private String eMail;
	private String phone;
	private String address;
	private String city;
	private String state;
	private String code;
	
//	public Person(String givenName, String surName, int age, Gender gender, String eMail, String phone, String address,
//			String city, String state, String code) {
//		super();
//		this.givenName = givenName;
//		this.surName = surName;
//		this.age = age;
//		this.gender = gender;
//		this.eMail = eMail;
//		this.phone = phone;
//		this.address = address;
//		this.city = city;
//		this.state = state;
//		this.code = code;
//	}
	
	public Person(Builder builder) {
		super();
		this.givenName = builder.givenName;
		this.surName = builder.surName;
		this.age = builder.age;
		this.gender = builder.gender;
		this.eMail = builder.eMail;
		this.phone = builder.phone;
		this.address = builder.address;
		this.city = builder.city;
		this.state = builder.state;
		this.code = builder.code;
	}
	
	public static class Builder {
		
		private String givenName;
		private String surName;
		private int age;
		private Gender gender;
		private String eMail;
		private String phone;
		private String address;
		private String city;
		private String state;
		private String code;
		
		public Builder() {
			
		}

		public Builder setGivenName(String givenName) {
			this.givenName = givenName;
			return this;
		}

		public Builder setSurName(String surName) {
			this.surName = surName;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setGender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Builder seteMail(String eMail) {
			this.eMail = eMail;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public Builder setState(String state) {
			this.state = state;
			return this;
		}

		public Builder setCode(String code) {
			this.code = code;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
		
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCode() {
		return code;
	}
	
	
	
	
	
}
