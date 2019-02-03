package com.bilgeadam.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferReaderReadByLineExample {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("./story.txt")));
		String line;
		while((line = bufferedReader. readLine()) != null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
	}
}
