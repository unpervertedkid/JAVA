package catchingExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TryCatch {

	public static void main(String[] args) {
		
		//Create a list to contain all the files in the readme.txt file
		
		List<String> lines = Collections.emptyList();
		
		//Try to read a file that does not exist provoking an exception
		
		try {
			lines = Files.readAllLines(Paths.get("readme.txt"));
			//Catch the exception
		}catch(NullPointerException|IOException x) {
			System.out.println("Exception: File not found");
			//Print the full exception details
			x.printStackTrace();
		}
		
		
		//This will not execute
		//Try to print the list contents
		Iterator iterator = lines.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
