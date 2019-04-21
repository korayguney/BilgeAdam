package com.bilgeadam.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authorid", insertable=true, length=10, nullable=false, unique=true, updatable=false)
	private int author_id;
	
	@Column(name="authorname", unique=false, length=100, nullable=false)
	private String author_name;
	
	@OneToMany(mappedBy="author", fetch = FetchType.EAGER)
	List<Book> books = new ArrayList<>();
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String author_name) {
		super();
		this.author_name = author_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [author_id=" + author_id + ", author_name=" + author_name + ", books=" + books + "]";
	}
	
	
	
	
}
