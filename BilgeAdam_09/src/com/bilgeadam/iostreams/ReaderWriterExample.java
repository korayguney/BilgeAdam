package com.bilgeadam.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterExample {

	public static void main(String[] args) {
		
		try (Reader reader = new FileReader(new File(".\\story.txt")); Writer writer = new FileWriter(".\\story-copy.txt"); ) {
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
			System.out.println("Starts read...");
			
			int readByte;
			long count =0;
			while((readByte = bufferedReader.read()) != -1) {
				bufferedWriter.write(readByte);
				count += readByte;
			}
			
			System.out.println("Read character : " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
