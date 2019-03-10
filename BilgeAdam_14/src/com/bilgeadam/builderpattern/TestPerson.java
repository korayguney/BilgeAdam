package com.bilgeadam.builderpattern;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person.Builder().setAddress("TUR").seteMail("korayguney@hotmail.com").setCity("IST")
				.setGender(Gender.MALE).setGivenName("Koray").setSurName("Güney").build();

		System.out.println(person.getGivenName() + " " + person.getSurName());
		
		
	}

}
