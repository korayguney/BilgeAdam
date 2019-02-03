package com.bilgeadam.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOUtils {

	public static void fileWrite(String content, String path) {
		
		try {
			Writer writer = new FileWriter(path);
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String fileRead(String path) {
		
		String context = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				context += line +"\n";
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return context;
	}
	
}
