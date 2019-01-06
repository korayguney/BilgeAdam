package com.bilgeadam.aggregationchallenge;

public class TestBook {

	
	public static void main(String[] args) {
		
		Author author1 = new Author("Buket Uzuner", "buzuner@gmail.com", 'f');
		Author author2 = new Author("Orhan Pamuk", "opamuk@gmail.com", 'm');
		Author[] authers = {author1, author2};
		
		
		Book book = new Book("Uzun Beyaz Bulut Gelibolu", authers, 25.50);
		
		//System.out.println(author);
		System.out.println(book);
		
		
	}
}
