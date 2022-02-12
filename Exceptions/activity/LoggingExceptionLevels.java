package activity;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExceptionLevels {
	
	
	
	/**
	 * Function to throw nullpointerException error
	 * @throws NullPointerException
	 */
	public static void issueNullPointerException() throws NullPointerException {
		throw new NullPointerException("Exception: File is null");
	}
	
	/**
	 * Function to throw an error if the file is not found
	 * @throws FileNotFoundException
	 */
	public static void issueFileNotFoundException() throws FileNotFoundException{
		throw new FileNotFoundException("Exception: File not found");
	}
	public static void main(String[] args) {
		
		
		//Create logger object
		Logger logger = Logger.getAnonymousLogger();
		
		int exceptionNum = Integer.valueOf(0);
		
		//Switch case to throw different errors for each case
		switch(exceptionNum){
		case 1:
			try {
				issueNullPointerException();
			}catch(NullPointerException ne){
				logger.log(Level.SEVERE, "File is null" , ne);
				
			}
		case 2:
		 
			try {
				issueFileNotFoundException();
			}catch(FileNotFoundException fe){
				logger.log(Level.WARNING, "File not found" , fe);
				
			}
		case 3:
			try {
				issueFileNotFoundException();
			}catch(FileNotFoundException fe){
				logger.log(Level.INFO, "File not found" , fe);
			}
			
		}

	}

}
