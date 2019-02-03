package com.bilgeadam.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyWithAutoClose {

	public static void main(String[] args) {

		String inputFile = "C:/Users/kgb20/OneDrive/Resimler/75178.jpg";
		String outputFile = "C:/Users/kgb20/OneDrive/Resimler/75178-copy.jpg";

		File file = new File(inputFile);
		System.out.println("File has the lenght of " + file.length() + " bytes");

		try (InputStream inputStream = new FileInputStream(inputFile);
				OutputStream outputStream = new FileOutputStream(outputFile);) {

			int readByte;

			while ((readByte = inputStream.read()) != -1) {
				outputStream.write(readByte);
			}

			System.out.println("File is copied to ---> " + outputFile);

		} catch (FileNotFoundException e) {
			System.out.println("File is not found at the " + inputFile);
		} catch (IOException e) {
			System.out.println("Something went wrong");
		} 
	}

}
