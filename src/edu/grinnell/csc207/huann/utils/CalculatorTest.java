package edu.grinnell.csc207.huann.utils;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEva10() {
		assertEquals(BigInteger.valueOf(0), Calculator.eval0("0"));
		assertEquals(BigInteger.valueOf(2), Calculator.eval0("1 + 1"));
		assertEquals(BigInteger.valueOf(4), Calculator.eval0("1 + 2 + 1"));
		assertEquals(BigInteger.valueOf(9), Calculator.eval0("1 + 2 * 3"));
		assertEquals(BigInteger.valueOf(-11), Calculator.eval0("1 * 2 - 13"));
		assertEquals(BigInteger.valueOf(3), Calculator.eval0("6 / 2 ^ 1"));
	}

	@Test
	public void testFewestCoins() {
        assertArrayEquals(new int[] {2, 7, 11, 0}, Calculator.fewestCoins(20));
        assertArrayEquals(new int[] {0, 28, 0, 0}, Calculator.fewestCoins(28));
        assertArrayEquals(new int[] {0, 0, 0, 0}, Calculator.fewestCoins(0));
	}

}
