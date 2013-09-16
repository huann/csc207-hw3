package edu.grinnell.csc207.huann.utils;

//@Author: Ann Hu

public class StringUtils {

	/*
	 * Given a string and a character, uses the character as a 
	 * separator to split the string into substrings. Returns an 
	 * array of these substrings.
	 */
	public static String[] splitAt(String text, char separator) {
		int outLen = 1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == separator) {
				outLen++;
			} //if the separator appears
		} //for every character in the input string
		//create a new string of length outLen to hold the output
		String[] output = new String[outLen];
		int index = 0;
		//use a StringBuffer to temporarily store substrings
		StringBuffer subText = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == separator) {
				output[index] = subText.toString(); //having this
				//here takes care of leading empty's
				subText.setLength(0); //clear out subText
				index++;
			} //if the separator appears
			else {
				subText.append(text.charAt(i));
			} //else
			output[index] = subText.toString(); //having this outside
			//the else statement takes care of trailing empty's
		} //for every character in the input string
		return output;
	} //splitAt(string [], char)


	/*
	 * Given a string, uses a comma as a separator to split the 
	 * string into substrings. 
	 * Special cases: 
	 * 		(1) If the separator is in text surrounded by double 
	 * 		quotation marks, takes it as part of a substring.
	 * 		(2) If two double quotation marks appear in sequence, 
	 * 		treats them as single character. 
	 * Returns an array of these substrings.
	 */
	public static String[] splitCSV(String text) {
		char separator = ',';
		
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '"') {
				count++;
			}
		}
		if (count < 2) {
			return splitAt(text, separator);
		}
		else {
			
			
			return null;
		}	
	} //splitCSV(string [])


	/*
	 * Given a string of leet text, returns the corresponding normal
	 * text.
	 */
	public static String deLeet(String leet) {
		//create an array of arrays to store leet and corresponding chars
		String[][] leetTrans = new String[][] { { "@", "a" }, 
				{ "|3", "b" }, { "3", "e" }, { "1", "l" }, 
				{ "|\\|", "n" }, { "0", "o" }, { "+", "t" } };
		for (int i = 0; i < leetTrans.length; i++) {
			leet = leet.replace(leetTrans[i][0], leetTrans[i][1]);
		} //for every leet character, replace with corresponding normal
		return leet;
	}//deLeet(string [])
	
	
	/*
	 * Given a name, returns a verse from Shirley Ellis' "The Name 
	 * Game"
	 */
	public static String nameGame(String name) {
		String cdr = "";
		int position = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.toLowerCase().charAt(i) == 'a' || 
					name.toLowerCase().charAt(i) == 'e' || 
					name.toLowerCase().charAt(i) == 'i' || 
					name.toLowerCase().charAt(i) == 'o' || 
					name.toLowerCase().charAt(i) == 'u') {
				break;
			} //if the ith character in name is a vowel
			else {
				position++;
			} //else
		} //for every character in name
		cdr = name.substring(position); //cuts off beginning consonants
		String verse = 
				name + "!/n" + 
				name + ", " + name + " bo B" + cdr + 
				" Bonana fanna fo F" + cdr +
				"/nFee fy mo M" + cdr + ", " + name + "!";
		return verse;
	} //nameGame(string [])
}

/*
 * Citations: 
 * For all the methods I looked up on Java API (Oracle) 
 * ("replace", "substring", etc.), I looked at examples on 
 * StackOverflow and tutorialspoint for further guidance.
 */