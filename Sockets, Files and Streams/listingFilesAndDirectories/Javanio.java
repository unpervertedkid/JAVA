package listingFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Javanio {

	public static void main(String[] args) throws IOException {
		
		//Create a String containing pathway
		String pathway = System.getProperty("java.io.tmpdir");
		
		//Get the path to the directory
		Path path = Paths.get(pathway);
		
		Stream<Path> fileNames = Files.list(path);
		
		fileNames.limit(5).forEach(System.out::println);
		
		fileNames.close();
		

	}

}
