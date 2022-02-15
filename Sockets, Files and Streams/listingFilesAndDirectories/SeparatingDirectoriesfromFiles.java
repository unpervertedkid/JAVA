package listingFilesAndDirectories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeparatingDirectoriesfromFiles {

	public static void main(String[] args) throws IOException {
		
		//Get the path 
		String pathString = System.getProperty("java.io.tmpdir");
		
		//Create arrayList to hold the files
		List<String> fileNames = new ArrayList<String>();
		
		//Stream to hold paths to files in the path
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(pathString));
		
		for(Path path: directoryStream) {
			fileNames.add(path.toString());
		}
		
		//Print the paths out specifying if file if dir or file
		for(int i = 0; i < 5; i++) {
			String filePath = fileNames.get(i);
			String fileType = Files.isDirectory(Paths.get(filePath)) ? "Dir" : "Fil";
			
			System.out.println(fileType + " " + filePath);

			
		}
		
		
	}

}
