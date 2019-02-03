package com.bilgeadam.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	
	public static void main(String[] args) throws IOException {
		
		String [] attendees = {"Anýl", "Sonay", "Kübra", "Yýldýz", "Yunus", "Gökhan"};
		
		Writer writer = new FileWriter(new File("./attendees.txt")); // open source
		for (String name : attendees) {
			writer.write(name + "\n");  // write content
		}
		writer.close(); // close source
		
	}
}
