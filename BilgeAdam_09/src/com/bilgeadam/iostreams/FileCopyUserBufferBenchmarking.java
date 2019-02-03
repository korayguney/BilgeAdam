package com.bilgeadam.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyUserBufferBenchmarking {

	public static void main(String[] args) {

		String inputFile = "C:/Users/kgb20/OneDrive/Resimler/75178.jpg";
		String outputFile = "C:/Users/kgb20/OneDrive/Resimler/75178-copy.jpg";

		File file = new File(inputFile);
		System.out.println("File has " + file.length() + " bytes size");

		int[] byteOfPackets = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1024 };

		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		long startTime, finishedTime;
		
		
		try {
			for (int i = 0; i < byteOfPackets.length; i++) {
				byte[] byteSize = new byte[byteOfPackets[i] * 1024];
				inputStream = new FileInputStream(inputFile);
				outputStream = new FileOutputStream(outputFile);

				int readByte = 0;
				
				startTime = System.nanoTime();
				
				while ((readByte = inputStream.read(byteSize)) != -1) {
					outputStream.write(byteSize,0,readByte);
				}
				
				finishedTime = System.nanoTime() - startTime;
				System.out.println(byteOfPackets[i] +" KB : " + (finishedTime/100000) +" msec" );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
