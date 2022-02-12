package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExceptions {

	public static void main(String[] args) {
		
		//Create a logger object
		Logger logger = Logger.getAnonymousLogger();
		
		//Initialize a null String
		String s = null;
		
		//Invoke an  exception
		try {
			System.out.println(s.length());
		}catch(NullPointerException n ) {
			logger.log(Level.SEVERE, "Exception happened ", n);
		}
		

	}

}
