package com.bilgeadam.streamapi1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamGeneration {

	public static void main(String[] args) throws IOException {
		
		// use emtpy() method
		Stream<String> strEmpty = Stream.empty();
		
		// use builder() method
		Stream<String> strBuild = Stream.<String>builder().add("Ali").add("Veli").add("Ayþe").build();
		strBuild.forEach(t -> System.out.println("Foreach :" + t));
		
		// use stream() method
		Arrays.asList("A1", "b1", "c2", "D3").stream().forEach(t -> System.out.println("Foreach :" + t));
//		strStream.forEach(t -> System.out.println("Foreach :" + t));
		System.out.println("=====================");
		// use of() method
		Stream<String> strOf =Stream.of("A1", "b1", "c2", "D3");
		strOf.forEach(t -> System.out.println("Foreach :" + t));
		 
		// use Arrays.stream method
		DoubleStream strStream = Arrays.stream(new double[] {1.0 , 2.0, 3.0});
		strStream.forEach(value -> System.out.println("Foreach double : " + value));
		
//		Stream<Double> strStream2 = Arrays.stream(new Double[] {1.0 , 2.0, 3.0});
		
		// use generate() method
		Stream.generate(() -> 1000).limit(10).forEach(System.out::println);
		
		System.out.println("=====================");
		// use iterate() method
		Stream<Integer> strIterate = Stream.iterate(20, t -> t+10);
		strIterate.limit(5).forEach(System.out::println);;
		
		System.out.println("=====================");
		// use stream reading a file
		Path path = Paths.get("./Names");
		Stream<String> strFile = Files.lines(path, Charset.defaultCharset());
		strFile.filter(StreamGeneration::returnWhichStartsWith).forEach(s -> System.out.println(s));
		
	}
	
	public static boolean returnWhichStartsWith(String name) {
		return name.startsWith("K");
	}
}
