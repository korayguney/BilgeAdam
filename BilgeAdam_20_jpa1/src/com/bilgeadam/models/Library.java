package com.bilgeadam.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="libraryid", insertable=true, length=10, nullable=false, unique=true, updatable=false)
	private int lib_id;
	
	@Column(name="libname", unique=false, length=200, nullable=false)
	private String library_name;
	@Column(name="libaddr", unique=true, length=500, nullable=true)
	private String library_addr;
	
	@ManyToMany(mappedBy="libraries")
	List<Book> books = new ArrayList<>();
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public Library(String library_name, String library_addr) {
		super();
		this.library_name = library_name;
		this.library_addr = library_addr;
	}

	public String getLibrary_name() {
		return library_name;
	}

	public void setLibrary_name(String library_name) {
		this.library_name = library_name;
	}

	public String getLibrary_addr() {
		return library_addr;
	}

	public void setLibrary_addr(String library_addr) {
		this.library_addr = library_addr;
	}

	public int getLib_id() {
		return lib_id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [lib_id=" + lib_id + ", library_name=" + library_name + ", library_addr=" + library_addr
				+ ", books=" + books + "]";
	}
	
	
}
