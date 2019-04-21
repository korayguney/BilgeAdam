package com.bilgeadam.models;

public enum Category {
	
	SCI_FI("Sci-fi"),
	HORROR("Horror"),
	DRAMA("Drama"),
	KIDS("Kids");
	
	private String categoryname;
	
	private Category(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategoryname() {
		return categoryname;
	}
	
}
