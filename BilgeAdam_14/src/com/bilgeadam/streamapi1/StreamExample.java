package com.bilgeadam.streamapi1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> intArr = new ArrayList<>();
		intArr.add(78);
//		intArr.add(10);
		intArr.add(10);
		intArr.add(35);
		intArr.add(45);
		intArr.add(20);
		
		List<Integer> newSalaryList = intArr.stream().map(a -> a *1000).filter(m -> m < 50000).sorted().limit(2).peek(b -> System.out.println("Salary :" + b)).collect(Collectors.toList());
		newSalaryList.stream().sorted((m1,m2)-> (m2 - m1)).forEach(System.out::println);
		
		boolean result = newSalaryList.stream().anyMatch(s -> s.intValue() == 10000);
		System.out.println(result);
		
		boolean result2 = newSalaryList.stream().noneMatch(s -> s.intValue() == 30000);
		System.out.println(result2);
		
		Stream<Integer> newStr = newSalaryList.stream();
		Supplier<Stream<Integer>> sup = () -> newSalaryList.stream();
		sup.get().allMatch(s -> s.intValue() == 10000 || s.intValue() == 20000);
		
		boolean result3 = newStr.peek(s-> System.out.println("allMatch :" + s)).allMatch(s -> s.intValue() == 10000 || s.intValue() == 20000);
		
//		boolean result4 = newStr.peek(s-> System.out.println("allMatch :" + s)).allMatch(s -> s.intValue() == 10000 || s.intValue() == 20000);
		System.out.println(result3);
		
		
	}

}
