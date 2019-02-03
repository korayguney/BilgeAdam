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

public class ReaderWriterExampleUserBuffer {

	public static void main(String[] args) {
		
		try (Reader reader = new FileReader(new File(".\\story.txt")); Writer writer = new FileWriter(".\\story-copy.txt"); ) {
			
			System.out.println("Starts read...");
			
			char[] charArr = new char[128];
			
			int readByte;
			long count =0;
			while((readByte = reader.read(charArr)) != -1) {
				writer.write(charArr, 0, readByte);
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
