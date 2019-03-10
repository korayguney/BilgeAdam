package com.bilgeadam.streamapichallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonUtils {

	public static List<Person> readFile(String path) {

		ArrayList<Person> persons = new ArrayList<>();

		try {
			FileReader fileReader = new FileReader(new File(path));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = "";

			while ((line = bufferedReader.readLine()) != null) {
				String[] arr = line.split(" ");
				persons.add(new Person(arr[0], arr[1], Integer.valueOf(arr[2])));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return persons;

	}

}
