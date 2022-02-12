package catchingExceptions;

public class ThrowCustomException {
	
	
	public static class error extends Exception{
		
		//Default Constructor 
		error(){
			super();
		}
		
		//Method to handle error with message
		error(String message){
			super(message);
		}
		
		//Method to handle error with cause
		error(Throwable cause){
			super(cause);
		}
		
		//Method to handle error with both message and cause
		error(String message,Throwable cause){
			super(message,cause);
		}
	}
	//The method throws the custom error
	public static void main(String[] args) throws error{
		
		//Initialize a null String
		String s = null;
		
		//Invoke an exception by trying to find lenght of null string 
		try {
			System.out.println(s.length());
		}catch(NullPointerException ne) {
			throw new error("String is null",ne);
		}
		finally {
			System.out.println("Exception closed!");
		}
		

	}

}
