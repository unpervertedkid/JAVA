package listingFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class JavaIoFile {

	public static void main(String[] args) throws IOException{
		
		//Create a pathstring
		String pathString = System.getProperty("java.io.tmpdir");
		
		//Get files in the directory and store them in an array
		String[] fileNames = new File(pathString).list();
		
		//Print the file names, 5
		for(int i = 0; i < 5; i++) {
			System.out.println(fileNames[i]);
		}

	}

}
