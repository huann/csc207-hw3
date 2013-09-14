package edu.grinnell.csc207.huann.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testSplitAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSplitCSV() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeLeet() {
		assertEquals("e", StringUtils.deLeet("3"));
		assertEquals("leet", StringUtils.deLeet("133+"));
		assertEquals("eat banana", StringUtils.deLeet("3@+ |3@|\\|@|\\|@"));
		assertEquals("lent boat", StringUtils.deLeet("13|\\|+ |30@+"));
	}

	@Test
	public void testNameGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testFewestCoins() {
		fail("Not yet implemented");
	}

}
