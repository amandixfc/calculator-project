package com.mila.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	void testAdd() {
		assertTrue(calculator.add(2, 2) == 4);
	}

	@Test
	void testSubstract() {
		assertTrue(calculator.substract(4, 2) == 2);
	}

	@Test
	void testMultiply() {
		assertTrue(calculator.multiply(4, 2) == 8);
	}

	@Test
	void testDivide() {
		assertTrue(calculator.divide(15, 5) == 3);
	}

}
