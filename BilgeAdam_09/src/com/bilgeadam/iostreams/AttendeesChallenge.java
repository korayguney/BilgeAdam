package com.bilgeadam.iostreams;

public class AttendeesChallenge {

	public static void main(String[] args) {
		
		String context = IOUtils.fileRead("./input");
		String[] attArr = context.split("\n");
		System.out.println("There are " + attArr.length +" attendees in the classroom");
		String[] names;
		String name= "";
		for (int i = 0; i < attArr.length; i++) {
			names = attArr[i].split(" ");
			name += names[0].toUpperCase() + "\n";
		}
		
		IOUtils.fileWrite(name, "./output.txt");
		System.out.println("Finished");
	}
	
	
}
