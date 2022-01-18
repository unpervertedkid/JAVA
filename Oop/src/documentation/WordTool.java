package documentation;
/**
 * <h1>WordTool</h1>
 * A class to perform calculations about a text.
 * 
 * @author Brian Silah
 * @version 0.1
 * @since 20220117
 * 
 *
 */
public class WordTool {
	
	public WordTool() {
		
	}
	
	/**
	 * <h2>WordCount</h2>
	 * Returns the amount of words in a text, taking a string as a parameter
	 * @param s
	 * @return int 
	 */
	
	private int wordCount(String s) {
		//If entry is null or empty, count is zero 
		int count = 0;
		//Evaluate if otherwise 
		if (! ( s == null || s.isEmpty())) {
			//Use spit method to separate words having whitespace as Separator 
			String[] w = s.split("\\S+");
			count = w.length;
		}
		
		return count;
	}
	
	/**
	 * <h2>symbolCount</h2>
	 * Returns the amount of symbols in a string, with or without counting spaces
	 * @param s
	 * @param withSpaces
	 * @return int
	 */
	
	private int symbolCount(String s, boolean withSpaces) {
		//If empty or null, count is zero
		int count = 0;
		//Evaluate if otherwise
		if(!(s == null || s.isEmpty())) {
			//With whitespace return the full length
			if(withSpaces) {
				count = s.length();
			}
			//Without whitespace, eliminate whitespace
			else {
				count = s.replace(" ", "").length();
			}
		}
		//Return the count
		return count;
	}
	
	/**
	 * <h2>getFrequency</h2>
	 * Returns the number a character occurs in the string provided
	 * 
	 * @param s
	 * @param c
	 * @return int
	 */
	
	private int getFrequency(String s, char c) {
		//If empty or null, count is zero
		int count = 0;
		//Evaluate if otherwise
		if(!(s == null || s.isEmpty())) {
			count = s.length() - s.replace(Character.toString(c), "").length();
		}
		
		return count;
	}
	
	/**
	 * <h2>analyzeString</h2>
	 * Accesses the private methods and passes the provided parameters into it
	 * 
	 * @param s
	 * @param character
	 */
	
	public void analyzeString(String s,char character) {
		System.out.println("Analyzing text: \n" + s);
		System.out.println("Total words: " + wordCount(s));
		System.out.println("Total symbols(With spaces): " + symbolCount(s,true));
		System.out.println("Total symbols(Without spaces): " + symbolCount(s,false));
		System.out.println("Character '" + character + "' appears " + getFrequency(s,character) + " times");
	}
}
