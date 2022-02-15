package creatingWritingFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingFilesandDirectories {

	public static void main(String[] args) {
		String pathString = "C:\\Users\\Hp 840 i5\\Documents\\Java documents\\NewDirectory";
		Path pathDir = Paths.get(pathString);
		
		//Check if directory exists
		if(Files.exists(pathDir)) {
			System.out.println("WARNING : Directory already exists at " + pathString);
		}
		//If it does not exist try creating one
		else {
			try {
				//Create Directory
				Files.createDirectories(pathDir);
				System.out.println("Directory created at " + pathString);
			}catch(IOException ioe){
				System.out.println("ERROR : Could  not create Directory");
				System.out.println("EXCEPTION : " + ioe.getMessage());
			}
		}

		//Create a file
		String fileName = "Temp.txt";
		Path pathFile = Paths.get(pathString + "\\" + fileName);
		
		
		//Check if file Exists
		if(Files.exists(pathFile)) {
			System.out.println("WARNING : file already exists at " + pathFile);
		}else {
			try {
				Files.createFile(pathFile);
				System.out.println("File created at " + pathFile);
			}catch (IOException ioe) {
				System.out.println("ERROR : Could not create file");
				System.out.println(ioe.getMessage());
			}
		}

	}

}
