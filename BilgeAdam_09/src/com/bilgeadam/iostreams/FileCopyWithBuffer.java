package com.bilgeadam.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyWithBuffer {

	public static void main(String[] args) {

		String inputFile = "C:/Users/kgb20/OneDrive/Resimler/75178.jpg";
		String outputFile = "C:/Users/kgb20/OneDrive/Resimler/75178-copy.jpg";

		File file = new File(inputFile);
		System.out.println("File has the lenght of " + file.length() + " bytes");

		InputStream inputStream = null;
		OutputStream outputStream = null;

		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		long startTime, finishTime;

		try {
			inputStream = new FileInputStream(inputFile); // Open an input stream
			outputStream = new FileOutputStream(outputFile);

			bufferedInputStream = new BufferedInputStream(inputStream);
			bufferedOutputStream = new BufferedOutputStream(outputStream);

			int readByte;
			startTime = System.nanoTime();
			while ((readByte = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write(readByte);
			}
			bufferedOutputStream.flush();
			finishTime = System.nanoTime() - startTime;

			System.out.println("File is copied to ---> " + outputFile);
			System.out.println("Elapsed time : " + (finishTime / 1000000) + " msec");

		} catch (FileNotFoundException e) {
			System.out.println("File is not found at the " + inputFile);
		} catch (IOException e) {
			System.out.println("Something went wrong");
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
				if (outputStream != null)
					outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
