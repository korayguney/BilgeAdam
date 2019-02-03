package com.bilgeadam.fileclass;

import java.io.File;
import java.io.FilenameFilter;

public class FileExample {

	public static void main(String[] args) {
		
		File directory = new File("C:\\Users\\kgb20\\OneDrive\\Resimler");
		File directory2 = new File("C:\\Users\\kgb20\\OneDrive\\Resimler\\BilgeAdamResimler");
		File file = new File("C:/Users/kgb20/OneDrive/Resimler/75178.jpg"); // absolute path
		File file2 = new File("C:/Users/kgb20/OneDrive/Resimler/testtest.txt"); // absolute path
		File directory3 = new File(".\\src\\com\\bilgeadam\\iostreams");

//		
//		System.out.println("Is directory exist : " + directory.exists());
//		System.out.println("Is file exist : " + file.exists());
//		
//		System.out.println("Lenght of the file " + file.length() + " bytes");
//		System.out.println("Lenght of the directory " + directory.length() + " bytes");
//		
//		System.out.println("Is directory : " + directory.isDirectory());
//		System.out.println("Is directory : " + file.isDirectory());
//		
//		System.out.println("Is directory : " + directory.isDirectory());
//		System.out.println("Is directory : " + file.isDirectory());
//		
//		System.out.println("Can read directory: " + directory.canRead());
//		System.out.println("Can read file : " + file.canRead());
//		
//		System.out.println("Can write directory: " + directory.canWrite());
//		System.out.println("Can write file : " + file.canWrite());
//		
//	//	System.out.println("Is file deleted : " + file2.delete());;
////		System.out.println("File 2 will be deleted");
////		file2.deleteOnExit();
////		
////		String test ="";
////		for (int i = 0; i < 10000; i++) {
////			for (int j = 0; j < 10000; j++) {
////				String test2 = test + j;
////			}
////		}
//		
////		System.out.println("File 2 is deleted? : " + file2.exists());
//		System.out.println("Rename file 2 : " + file2.renameTo(new File("C:/Users/kgb20/OneDrive/Resimler/testtesttest.txt")));
//		
//		System.out.println("Is directory created : " + directory2.mkdir());
//		
//		for (File files : directory.listFiles()) {
//			System.out.println(files);
//		}
		
		String[] arr2 = directory3.list();
		String[] arr = directory3.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
		
	}
	
	
}
