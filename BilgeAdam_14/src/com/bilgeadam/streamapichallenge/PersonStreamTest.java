package com.bilgeadam.streamapichallenge;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class PersonStreamTest {

	public static void main(String[] args) {

		List<Person> students = PersonUtils.readFile("./students");

		// Write all person’s information to the console
		System.out.println("===========1==========");
		students.stream().forEach(System.out::println);

		// Filter persons whose ages are greater than 25 and
		// write only their names in CAPITAL letters to the console
		System.out.println("\n===========2==========");
		students.stream().filter(s -> s.getAge() > 25).map(s -> s.getFirstname().toUpperCase())
				.forEach(System.out::println);

		/*
		 * Sort first 5 persons according to their ages from younger to older and write
		 * in below format to the console; Koray ---> 35
		 */
		System.out.println("\n===========3==========");
		students.stream().sorted((s1, s2) -> s1.getAge() - s2.getAge()).limit(5).map(PersonStreamTest::test)
				.forEach(System.out::println);

		/*
		 * Calculate the average age of the persons in the class and write to the
		 * console,
		 */
		System.out.println("\n===========4==========");

		Double result = students.stream().collect(Collectors.averagingDouble(Person::getAge));
		System.out.println("Average age : " + result);

		double result2 = (students.stream().mapToDouble(s -> s.getAge()).average().getAsDouble());
		System.out.println("Average age : " + result2);

		 IntSummaryStatistics result3 = students.stream().collect(Collectors.summarizingInt(Person::getAge));
		System.out.println(result3);
		 
		/*
		 * Group persons according to their ages and write to the console in below
		 * format; age 18: [Ali Veli, Ayþe Güneþ] age 35: [Koray Güney]
		 */
		System.out.println("\n===========5==========");
		Map<Integer, List<Person>> groupedStu = students.stream().collect(Collectors.groupingBy(Person::getAge));
		groupedStu.forEach((age, p) -> System.out.printf("\nAge %d : %s", age, p));
	}

	public static String test(Person p) {
		return p.getFirstname() + " ----> " + p.getAge();
	}

}
