package com.bilgeadam.printerchallenge;

public class Printer {

	private int tonerLevel;
	private int pagesPrintedNumber;
	private boolean isDublex;

	public Printer(int tonerLevel, boolean isDublex) {
		this.tonerLevel = tonerLevel;
		this.pagesPrintedNumber = 0;
		this.isDublex = isDublex;
	}
	
	public Printer(boolean isDublex) {
		this.pagesPrintedNumber = 0;
		this.isDublex = isDublex;
	}

	public int fillupToner(int addedTonerAmount) {
		if (this.tonerLevel != -1 && this.tonerLevel < 100) {
			if (this.tonerLevel + addedTonerAmount < 100) {
				this.tonerLevel += addedTonerAmount;
			}
			
		} else {
			System.out.println("Wrong input");
		}
		return this.tonerLevel;
	}
	
	public int calcPrintPage(int pagesPrinted) {
		if (isDublex) {
			this.pagesPrintedNumber += pagesPrinted/2 + pagesPrinted%2;
			this.tonerLevel-=pagesPrinted*2;
		} else {
			this.pagesPrintedNumber += pagesPrinted;
			this.tonerLevel-=pagesPrinted;
		}
		return this.pagesPrintedNumber;
	}
	
	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrintedNumber;
	}

	public void setPagesPrinted(int pagesPrinted) {
		this.pagesPrintedNumber = pagesPrinted;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}

}
