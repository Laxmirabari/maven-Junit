package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum1() {
		int result = calculator.sum(4, 4);

		assertEquals(8, result);
	}

	@Test
	public void testDivison1() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	//@Ignore
	@Test
	public void testEqual11() {
		boolean result = calculator.equalIntegers(20, 20);
		assertFalse(result);
		//assertTrue(result);

	}

	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}
}
