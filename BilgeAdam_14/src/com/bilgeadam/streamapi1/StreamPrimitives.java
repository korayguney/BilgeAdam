package com.bilgeadam.streamapi1;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamPrimitives {

	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(System.out::println);
		
		
		OptionalDouble result = LongStream.rangeClosed(20, 30).map(a -> {
			System.out.println("map : " + a);
			return (a * 2);
		}).peek(c -> System.out.println("peek :" + c)).average();
		System.out.println(result.getAsDouble());
		
		System.out.println("========================");
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(5);
		doubleStream.forEach(System.out::println);

		// convert primitive to Object
		Arrays.stream(new double[] {1.0 , 2.0, 3.0}).mapToInt(value -> (int)value).mapToObj(a -> "A" + a).map(a -> a.toLowerCase()).forEach(System.out::println);
		
		foos(10);
		
	}
	
	 /**
     * Returns a {@code foos} consisting of the results of applying the
     * given function to the elements of this stream.
     *
     * <p>This is an <a href="www.google.com">intermediate
     * operation</a>.
     *
     * @param mapper a <a href="package-summary.html#NonInterference">non-interfering</a>,
     *               <a href="package-summary.html#Statelessness">stateless</a>
     *               function to apply to each element of x
     * @return void
     */
	public static void foos(int x) {
		System.out.println("In the foo method" + x);
	}
}
