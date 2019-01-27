package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExp4 {

	public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
			Scanner scanner = new Scanner(new File("missingpath.txt")); // checked exception
			System.out.println(1 / 0); // unchecked exception

	}
}
