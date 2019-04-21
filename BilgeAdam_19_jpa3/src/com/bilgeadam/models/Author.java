package com.bilgeadam.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authorid", length=20, nullable=false, unique=true)
	private int author_id;
	
	@Column(name="authorname", length=100, nullable=false, unique=false)
	private String author_name;
	
	@Column(name="authoraddr", length=150, nullable=true, unique=false)
	private String author_address;
	
	@Column(name="authortelno", length=100, nullable=true, unique=false)
	private String author_tel_no;
	
	@OneToMany(mappedBy="author")
	List<Book> books = new ArrayList<Book>();
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String author_name, String author_address, String author_tel_no) {
		super();
		this.author_name = author_name;
		this.author_address = author_address;
		this.author_tel_no = author_tel_no;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthor_address() {
		return author_address;
	}

	public void setAuthor_address(String author_address) {
		this.author_address = author_address;
	}

	public String getAuthor_tel_no() {
		return author_tel_no;
	}

	public void setAuthor_tel_no(String author_tel_no) {
		this.author_tel_no = author_tel_no;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getAuthor_id() {
		return author_id;
	}
	
	
	
	
	
}
