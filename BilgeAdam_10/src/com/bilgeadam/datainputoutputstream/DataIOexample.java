package com.bilgeadam.datainputoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOexample {

	public static void main(String[] args) throws IOException {
		writeDataOutput();
		readDataInput();
	}

	public static void readDataInput() throws IOException {
		FileInputStream fis = new FileInputStream(new File("./test.txt"));
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		
		fis.close();
		dis.close();
		
				
		
		
		
	}

	public static void writeDataOutput() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("./test.txt"));
		DataOutputStream das = new DataOutputStream(fos);

		das.writeInt(444);
		das.writeBoolean(true);
		das.writeChar('d');

		fos.flush();
		das.flush();

		fos.close();
		das.close();

	}

}
