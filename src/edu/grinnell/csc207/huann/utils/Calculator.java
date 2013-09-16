package edu.grinnell.csc207.huann.utils;

import java.math.BigInteger;

public class Calculator {

	public static BigInteger eva10(String expr) {
		String[] arrExpr = expr.split(expr);
		//char[] arrExpr = expr.toCharArray();
		BigInteger ans = 
				new BigInteger (arrExpr[0]);
				//why does this work??
		for (int i = 0; i < arrExpr.length; i++) {
			if (arrExpr[i] == "+") {
				//ans = ;
			}
			if (arrExpr[i] == "-") {
				
			}
			if (arrExpr[i] == "*") {

			}
			if (arrExpr[i] == "/") {

			}
			if (arrExpr[i] == "^") {

			}
		}
		return ans;
	} //eva10(string [])

}
