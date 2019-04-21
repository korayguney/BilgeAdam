package com.bilgeadam.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Library {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="libraryid", length=20, nullable=false, unique=true)
	private int library_id;
	
	@Column(name="libraryname", length=100, nullable=false, unique=false)
	private String library_name;
	
	@ManyToMany(mappedBy="libraries")
	private List<Book> books = new ArrayList<>();

	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public Library(String library_name) {
		super();
		this.library_name = library_name;
		this.books = books;
	}

	public String getLibrary_name() {
		return library_name;
	}

	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getLibrary_id() {
		return library_id;
	}
	
	
	
	
	
	
}
