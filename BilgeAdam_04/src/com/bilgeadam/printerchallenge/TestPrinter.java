package com.bilgeadam.printerchallenge;

public class TestPrinter {

	public static void main(String[] args) {

		Printer printer = new Printer(20, true);
		String initPageNum = String.format("Initialized printed page number is %d", printer.getPagesPrinted());
		System.out.println(initPageNum);
		
		printer.calcPrintPage(21);
		System.out.println("Printed page number : " + printer.getPagesPrinted());
		
		printer.calcPrintPage(50);
		System.out.println("Printed page number : " + printer.getPagesPrinted());
		
		
	}

}
