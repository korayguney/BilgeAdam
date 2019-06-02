package models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {

	private List<Book> books = new ArrayList<Book>();

	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	public Books(List<Book> books) {
		super();
		this.books = books;
	}

	@XmlElement(name="book")
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
