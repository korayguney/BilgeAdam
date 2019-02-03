package com.bilgeadam.iostreams;

public class FrodoChallenge {

	
	public static void main(String[] args) {
		
		String context = IOUtils.fileRead("./frodo.txt");
		String[] textLines = context.split("\n");
		
		int count = 0;
		int totalCount = 0;
		
		for (int i = 0; i < textLines.length; i++) {
			for (char charOfText : textLines[i].toCharArray()) {
				if(charOfText == 'a' || charOfText == 'e' || charOfText == 'i' || charOfText == 'o' || charOfText == 'u') {
					count++;
				}
			}
			System.out.println("Sentence " + (i+1) + " has " + count + " vowels");
			totalCount += count;
			count =0;
		}
		
		IOUtils.fileWrite("The total number of vowels are " +totalCount, "./frodo-output.txt");
		System.out.println("Finished");
	}
}
