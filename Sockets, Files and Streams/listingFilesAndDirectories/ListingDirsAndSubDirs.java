package listingFilesAndDirectories;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class ListingDirsAndSubDirs {

	public static void main(String[] args) throws IOException {
		
		//Create a path 
		Path path = Paths.get(System.getProperty("user.home"));
		
		//Walk the directories and subdir and store the files in a collection
		Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {
			
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
				System.out.println(dir.toString());
				return FileVisitResult.CONTINUE;
			}
			@Override
            public FileVisitResult visitFileFailed(Path file, IOException
exc)
                    throws IOException {
                System.out.println("visitFileFailed: " + file);
 return FileVisitResult.CONTINUE;
				
			}
		});
	}

}
