package com.bilgeadam.grocerylist;

import java.util.Scanner;

public class MainGroceryList {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean flag = true;
		int choice = 0;

		printInstructions();
		while (flag) {
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				groceryList.printGrocetyList();
				break;
			case 2:
				addItemToList();
				break;
			case 3:
				modifyItemInList();
				break;
			case 4:
				removeItemFromList();
				break;
			case 5:
				searchItemInList();
				break;
			case 6:
				flag= false;
				break;
			}

		}

	}

	private static void searchItemInList() {
		System.out.println("Please enter item name to search :");
		String item = scanner.nextLine();
		String message = (groceryList.onFile(item))? (item + " is on the list"): (item + " is NOT on the list");
		System.out.println(message);
	}

	private static void removeItemFromList() {
		System.out.println("Please write item name for remove:");
		groceryList.removeItemFromGroceryList(scanner.nextLine());
	}

	private static void modifyItemInList() {
		System.out.println("Please write current item name :");
		String oldItem = scanner.nextLine();
		System.out.println("Please write new item name :");
		String newItem = scanner.nextLine();
		groceryList.modifyItemInGroceryList(oldItem, newItem);
	}

	private static void addItemToList() {
		System.out.println("Please write item name :");
		String item = scanner.nextLine();
		groceryList.addGroceryItem(item);
	}

	private static void printInstructions() {
		System.out.println("Print choice options.");
		System.out.println("\t1-Print the list of grocery items.\n" + "\t2-Add an item to the list.\n"
				+ "\t3-Modify an item in the list.\n" + "\t4-Remove an item from the list.\n"
				+ "\t5-Search for an item in the list.\n" + "\t6-Quit the application.\n");
	}

}
