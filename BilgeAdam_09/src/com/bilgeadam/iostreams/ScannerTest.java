package com.bilgeadam.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new FileReader("./story.txt"));

		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}

		scanner.close();

	}

}
