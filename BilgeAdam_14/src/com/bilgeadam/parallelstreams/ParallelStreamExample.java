package com.bilgeadam.parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < 10000000; i++) {
			intList.add(i);
		}
		
		Stream<Integer> stream = intList.stream();
		Stream<Integer> pstream =intList.parallelStream();
		
		long startTime = System.nanoTime();
		stream.filter(s -> (s%10) == 0).forEach(s -> System.out.println("classic stream : " +s));
		long finishTime = System.nanoTime() - startTime;
		
		
		System.out.println("====================");
		long startTime2= System.nanoTime();
		pstream.filter(s -> (s%10) == 0).forEach(s -> System.out.println("parallel stream : " +s ));
		long finishTime2 = System.nanoTime() - startTime2;
		System.out.println("classic stream time --->  "+finishTime/1000);
		System.out.println("parallel stream time --->  "+finishTime2 /1000);
		
		
	}
	
	
	
}
