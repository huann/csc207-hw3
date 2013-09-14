package edu.grinnell.csc207.huann.utils;

//@Author: Ann Hu

public class StringUtils {

	public static String[] splitAt(String a, char b) {
		{
			{
			}
		}
		return null;
	} //splitAt(string [], char)


	public static String[] splitCSV(String a) {
		{
			{
			}
		}
		return null;
	} //splitCSV(string [])


	/*
	 * 
	 */
	public static String deLeet(String leet) {
		String[][] leetTrans = { { "@", "a" }, { "|3", "b" }, 
				{ "3", "e" }, { "1", "l" }, { "|\\|", "n" }, 
				{ "0", "o" }, { "+", "t" } };
		for (int i = 0; i < leetTrans.length; i++) {
			leet = leet.replace(leetTrans[i][0], leetTrans[i][1]);
		} //for every leet character, replace with the corresponding normal character
		return leet;
	}//deLeet(string [])
	
	
	public static String nameGame(String name) {
		
		String verse = "name! /nname, name bo name Bonana fana fo name /nFee fo mo name, name!";

		/*
		name + "!"
		name + ", " + name + "bo " + ... "fanna fo " ...
		"Fee fy mo " ... ", " name + "!"
		 */
		
		return verse;
	} //nameGame(string [])
	

	public static int[] fewestCoins(int a) {
		
		{
		}
		return null;
	} //fewestCoins(int)

}

/*
 * Citations: In writing the deLeet method, I looked up how to "replace" 
 * on Java API (Oracle) and looked at examples on StackOverflow for guidance.
 * 
 */