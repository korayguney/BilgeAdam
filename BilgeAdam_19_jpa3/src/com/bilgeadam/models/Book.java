package com.bilgeadam.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name="findAllBooks", query="select b from Book b")})
@NamedNativeQuery(name="findAllBook", query="select * from book", resultClass=Book.class)
// @EntityListeners(value = {LoadDataListener.class})
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookid", length=20, nullable=false, unique=true)
	private int book_id;
	
	@Column(name="bookname", length=100, nullable=false, unique=false)
	private String book_name;
	
	@Column(name="isbnnum", length=13, nullable=false, unique=true)
	private long ISBN_num;
	
	@Column(name="bookprice", length=5, nullable=true, unique=false)
	private double book_price;
	
	@Enumerated(EnumType.STRING)
	@Column(name="bookcategory")
	private Category book_category;
	
	@ManyToOne
	private Author author;
	
	@ManyToMany
	private List<Library> libraries = new ArrayList<>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String book_name, long iSBN_num, double book_price, Category book_category, Author author) {
		super();
		this.book_name = book_name;
		ISBN_num = iSBN_num;
		this.book_price = book_price;
		this.book_category = book_category;
		this.author = author;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public long getISBN_num() {
		return ISBN_num;
	}

	public void setISBN_num(long iSBN_num) {
		ISBN_num = iSBN_num;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	public Category getBook_category() {
		return book_category;
	}

	public void setBook_category(Category book_category) {
		this.book_category = book_category;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public int getBook_id() {
		return book_id;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", ISBN_num=" + ISBN_num + ", book_price="
				+ book_price + ", book_category=" + book_category + ", author=" + author + "]";
	}
	
	
}
