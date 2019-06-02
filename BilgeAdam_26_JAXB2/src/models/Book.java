package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	private long ISBN;
	private String name;
	private String author;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(long iSBN, String name, String author, double price) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	@XmlAttribute
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
