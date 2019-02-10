package com.bilgeadam.grocerylist;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> grocerylist = new ArrayList<>();

	public void addGroceryItem(String item) {
		grocerylist.add(item);
	}

	public void printGrocetyList() {
		System.out.println("You have " + grocerylist.size() + " item in your list");
		for (int i = 0; i < grocerylist.size(); i++) {
			System.out.println("\t Item " + (i + 1) + ": " + grocerylist.get(i));
		}
	}

	public void modifyItemInGroceryList(String currentItem, String newItem) {
		int position = findItem(currentItem);
		if (position >= 0) {
			grocerylist.set(position, newItem);
		}
	}

	public void removeItemFromGroceryList(String item) {
		int position = findItem(item);
		removeItemFromGroceryList(position);
	}

	public void removeItemFromGroceryList(int itemIndex) {
		if (itemIndex >= 0) {
			grocerylist.remove(itemIndex);
		}
	}
	
	public boolean onFile(String item) {
		int position = findItem(item);
		if(position >= 0) {
			return true;
		}
		return false;
	}
	

	private int findItem(String currentItem) {
		return grocerylist.indexOf(currentItem);
	}

}
