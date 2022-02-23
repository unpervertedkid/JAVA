package streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Reduction {

	public static void main(String[] args) {
		
		//Find sum of integers from array(Reduction)
		int[] studentMarks = {60,70,80,56,78};
		
		int total = (int)IntStream.of(studentMarks)
				.reduce(0, (subtotal, element) -> subtotal + element);
		System.out.println("The sum of the marks is = " + total);
		
		//Reduction - Summary Statistics *Works only with integers
		IntSummaryStatistics summary = IntStream.of(studentMarks)
				.summaryStatistics();
		System.out.println(summary);
				
				

	}

}
