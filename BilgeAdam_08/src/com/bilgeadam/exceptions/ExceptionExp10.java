package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExp10 {
	
	public static void main(String[] args) throws FileNotFoundException  {
		try {
			Scanner scanner = new Scanner(new File("D:/BilgeAdam/JavaSE_sunum/missingpath2.txt"));
		} catch (Exception e) {
			throw new FileNotFoundException("File is NOT EXIST !!!!!!!!!");
		}
	} 

}
