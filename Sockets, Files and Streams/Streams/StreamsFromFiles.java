package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFromFiles {

	public static void main(String[] args) throws IOException {
		
		//Stream from text file, filter and then print
		Stream<String> bands = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\Bands.txt"));
		System.out.println("Bands with names longer than 13 are : ");
		
		bands
			.sorted()
			.filter(x -> x.length() > 13)
			.forEach(System.out :: println);
		bands.close();
		
		//Stream countries from file, filter and print
		Stream<String> countries = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\Countries.txt"));
		System.out.println("\nCountries starting with 'K' are : ");
		
		countries
			.sorted()
			.filter(x -> x.startsWith("K"))
			.forEach(System.out :: println);
		countries.close();
		
		//Stream rows of text, filter save to a file
		System.out.println("\nCountries containing North are :");
		List<String> countriesWithNorth = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\Countries.txt"))
				.filter(x -> x.contains("North"))
				.collect(Collectors.toList());
		countriesWithNorth.forEach(System.out :: println);
		
		//Stream from csv file and count
		Stream<String> students = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\UserData.txt"));
		
		int correctMarks = (int)students
				.map(x -> x.split(","))
				.filter(x -> x.length == 4)
				.count();
		students.close();
		System.out.println("\nStudents with all marks are : " + correctMarks);
		
		//Stream from csv file, filter and print
		Stream<String> students1 = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\UserData.txt"));
		System.out.println("\nStudents with cat marks above 40");
		System.out.println("\nStudent" + "\t\tCat" + "\tFinal" + "\tTotal");
		students1
			.map(x -> x.split(","))
			.filter(x -> x.length == 4)
			.filter(x -> Integer.parseInt(x[1]) >= 40)
			.forEach(x -> System.out.println(x[0] + "\t\t" + x[1] + "\t"  + x[2] + "\t" + x[3]));
		students1.close();
		
		//Stream rows from csv, filter and Store in HashMap
		Stream<String> students2 = Files.lines(Paths.get("C:\\Users\\Hp 840 i5\\Documents\\Java documents\\UserData.txt"));
		
		Map<String, Integer> studentsFinal = new HashMap<>();
		
		studentsFinal = students2
				.map(x -> x.split(","))
				.filter(x -> x.length == 4)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[3])));
		students2.close();
		System.out.println("\n\nStudents final marks");
		System.out.println("\nStudent" + "\t\tMarks");
		for(String marks : studentsFinal.keySet() ) {
			System.out.println(marks + "\t\t" + studentsFinal.get(marks));
			
		}
	}
}
