package listingFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ListingDirectories {

	public static void main(String[] args) throws IOException {
		
		//String containing path string
		String pathString = System.getProperty("user.home");

		
		//Walk the location and store the directories in a list
		List<Path> subDirectories = Files.walk(Paths.get(pathString), 1).filter(Files::isDirectory).collect(Collectors.toList());
		
		//List the first five directories
		for(int i = 0;i<30 ; i++) {
			Path filePath = subDirectories.get(i);
			String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
			System.out.println(fileType + " " + filePath);
		}
	
	}

}
