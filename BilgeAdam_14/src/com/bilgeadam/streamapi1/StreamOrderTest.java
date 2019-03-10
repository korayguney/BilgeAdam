package com.bilgeadam.streamapi1;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOrderTest {

	public static void main(String[] args) {

		Stream.of("d2", "a1", "b3", "c1", "d5").filter(t -> {
			System.out.println("Filter : " + t);
			return t.startsWith("a");
		}).forEach(a -> {
			System.out.println("foreach : " + a);
		});

		// why order is important?
		System.out.println("=======1=======");
		Stream.of("d2", "a1", "b3", "c1", "d5").map(a -> {
			System.out.println("Map : " + a);
			return a.toUpperCase();
		}).filter(t -> {
			System.out.println("Filter : " + t);
			return t.startsWith("A");
		}).forEach(a -> {
			System.out.println("foreach : " + a);
		});

		// why order is important?
		System.out.println("=======2=======");
		Stream.of("d2", "a1", "b3", "c1", "d5").filter(t -> {
			System.out.println("Filter : " + t);
			return t.startsWith("a");
		}).map(a -> {
			System.out.println("Map : " + a);
			return a.toUpperCase();
		}).forEach(a -> {
			System.out.println("foreach : " + a);
		});

		
		System.out.println("=======3=======");
		Stream.of("d2", "a1", "b3", "c1", "d5").sorted((a1,a2) -> {
			System.out.printf("Sorted : %s;%s\n ", a1,a2);
			return a1.compareTo(a2);
		}).filter(t -> {
			System.out.println("Filter : " + t);
			return t.startsWith("a");
		}).map(a -> {
			System.out.println("Map : " + a);
			return a.toUpperCase();
		}).forEach(a -> {
			System.out.println("foreach : " + a);
		});
		
		System.out.println("=======4=======");
		Stream.of("d2", "a1", "b3", "c1", "d5").filter(t -> {
			System.out.println("Filter : " + t);
			return t.startsWith("a");
		}).map(a -> {
			System.out.println("Map : " + a);
			return a.toUpperCase();
		}).sorted((a1,a2) -> {
			System.out.printf("Sorted : %s;%s\n ", a1,a2);
			return a1.compareTo(a2);
		}).forEach(a -> {
			System.out.println("foreach : " + a);
		});
		
		System.out.println("=======Reuse streams=======");
		Stream<String> myFirstStream = Stream.of("d2", "a1", "b3", "c1", "d5").filter(s -> s.startsWith("a"));
		
//		myFirstStream.anyMatch(s -> {
//			System.out.println("anyMatch : " + s);
//			return true;
//		});
//		
//		myFirstStream.noneMatch(s -> {
//			System.out.println("anyMatch : " + s);
//			return true;
//		});
		
		Supplier<Stream<String>> reusableStream = () -> Stream.of("d2", "a1", "b3", "c1", "d5").filter(s -> s.startsWith("a"));
		reusableStream.get().anyMatch(s -> {
			System.out.println("anyMatch : " + s);
			return true;
		});
		
		reusableStream.get().noneMatch(s -> {
			System.out.println("noneMatch : " + s);
			return true;
		});
	}

}
