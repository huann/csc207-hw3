package edu.grinnell.csc207.huann.utils;

//@Author: Ann Hu

import java.math.BigInteger;

public class Calculator {

	/*
	 * Given a simple arithmetic expression in the form of a string, 
	 * evaluate in the order that operations appear. Only supports 
	 * addition, subtraction, multiplication, division, and 
	 * exponentiation.
	 */
	public static BigInteger eval0(String expr) {
		//use the spaces in the expression as a separator
		String[] arrExpr = expr.split(" ");
		//take the first number as temporary answer
		BigInteger ans = new BigInteger(arrExpr[0]);
		for (int i = 1; i < arrExpr.length; i++) {
			if (arrExpr[i].equals("+")) {
				ans = ans.add(new BigInteger(arrExpr[i+1]));
			} //if addition
			if (arrExpr[i].equals("-")) {
				ans = ans.subtract(new BigInteger(arrExpr[i+1]));
			} //if subtraction
			if (arrExpr[i].equals("*")) {
				ans = ans.multiply(new BigInteger(arrExpr[i+1]));
			} //if multiplication
			if (arrExpr[i].equals("/")) {
				ans = ans.divide(new BigInteger(arrExpr[i+1]));
			} //if division
			if (arrExpr[i].equals("^")) {
				ans = ans.pow(Integer.valueOf(arrExpr[i+1]));
			} //if exponentiation
		} //for
		return ans;
	} //eva10(string [])

	
	/*
	 * Given an integer, returns an array that gives the smallest 
	 * combination of coins (values are 2, 7, 11, and 54) to make up
	 * that value.
	 */
	public static int[] fewestCoins(int value) {
        int[] numCoins = new int[4];
        int n = 0;
        int min = -1;
        int count;
        int maxWot = value/2;
        int maxEater = value/7;
        int maxStickpair = value/11;
        int maxDeck = value/54;

        //loop through all cases and return the one using the fewest coins
        for(int i = 0; i <= maxWot; i++) {
                n += 2*i;
                for(int j = 0; j <= maxEater; j++) {
                        n += 7*j;
                        for(int k = 0; k <= maxStickpair; k++) {
                                n += 11*k;
                                for(int p = 0; p <= maxDeck; p++) {
                                        n += 54*p;
                                        if(n == value) {
                                                count = i +j + k + p;
                                                if(count < min || min == -1) {
                                                        numCoins[0] = 2*i;
                                                        numCoins[1] = 7*j;
                                                        numCoins[2] = 11*k;
                                                        numCoins[3] = 54*p;
                                                        min = count;
                                                } //if
                                        } //if 
                                        n -= 54*p;
                                } //for maximum decks
                                n -= 11*k;
                        } //for maximum stickpairs
                        n -= 7*j;
                } //for maximum eaters
                n -= 2*i;
        } //for maximum Wots
        return numCoins;
	} //fewestCoins(int)
}
