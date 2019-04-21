package com.bilgeadam.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
 * POJO (Plain Old Java Object)
 */
@Entity
@Table(name="book")
@NamedQueries({
	@NamedQuery(name="findAllBooks", query="SELECT b FROM Book b"),
	@NamedQuery(name="findBookById", query="SELECT b FROM Book b WHERE b.book_id =:bookid")})
@NamedNativeQuery(name="getFirstBook", query="SELECT * FROM book", resultClass=Book.class)
public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bookid", insertable=true, length=10, nullable=false, unique=true, updatable=false)
	private int book_id;
	
	@Column(name="bookname", unique=false, length=500, nullable=false)
	private String book_name;
	
	@Column(name="bookprice", unique=false, length=10, nullable=true)
	private double book_price;
	
	@Column(name="publishdate", unique=false, nullable=true)
	private LocalDate publish_date;
	
	@Column(name="isbn", unique=true, nullable=false, updatable=true)
	private long ISBN;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@ManyToMany (fetch = FetchType.EAGER)
	List<Library> libraries = new ArrayList<>();
	
	@ManyToOne
	private Author author;
	
	public Book() {
	}
	
	public Book(String book_name, double book_price, LocalDate publish_date, long iSBN, Category category) {
		super();
		this.book_name = book_name;
		this.book_price = book_price;
		this.publish_date = publish_date;
		ISBN = iSBN;
		this.category = category;
	}
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public double getBook_price() {
		return book_price;
	}
	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	public LocalDate getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(LocalDate publish_date) {
		this.publish_date = publish_date;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getBook_id() {
		return book_id;
	}

	public List<Library> getLibraries() {
		return libraries;
	}

	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price
				+ ", publish_date=" + publish_date + ", ISBN=" + ISBN + ", category=" + category;
	}
	
	
	
	
}
