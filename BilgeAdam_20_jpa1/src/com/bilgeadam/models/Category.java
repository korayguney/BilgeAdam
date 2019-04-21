package com.bilgeadam.models;

public enum Category {

	KIDS("Kids"),
	SCIFI("Sci-fi"),
	IT("IT"),
	HISTORY("History"),
	TRAVELLING("Travel book");
	
	private String category_name;
	
	private Category(String category_name) {
		this.category_name = category_name;
	}
	
	public String getCategory_name() {
		return category_name;
	}
	
}
