package streams;

import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {
		//Simple integer stream to display a range of numbers
		IntStream
			.range(1,10)
			.forEach(System.out :: print);
		System.out.println();
		
		//Print out a stream but skip some numbers
		IntStream
			.range(1, 15)
			.skip(9)
			.forEach(x -> System.out.println(x));
		
		//Find sum of numbers from a stream
		
		System.out.println("Sum of numbers between 0 and 10 = " + 
			IntStream
				.range(0, 10)
				.sum());
		
		//Find average of squares of numbers in an array
		int[] arrayNumbers = {12,24,56,34,20,7};
		
		System.out.println("The average of the squares of numbers is");
		
		IntStream.of(arrayNumbers)
			.map(x -> x*x)
			.average()
			.ifPresent(System.out :: print);
		
	}

}
