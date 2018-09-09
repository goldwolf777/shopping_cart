package com.capgemini.test;

import com.capgemini.test.calculations.Calculations;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {

	@Test
	void calculateThePriceForOneApple() {
		Calculations calculations = new Calculations();
		assertEquals(0.60, calculations.calculatePrice(asList("Apple")));
	}

	@Test
	void calculateThePriceForOneOrange() {
		Calculations calculations = new Calculations();
		assertEquals(0.25, calculations.calculatePrice(asList("Orange")));
	}

	@Test
	void calculateThePriceForOneOrangeAndOneApple() {
		Calculations calculations = new Calculations();
		assertEquals(0.85, calculations.calculatePrice(asList("Orange", "Apple")));
	}

	@Test
	void calculateThePriceForMultipleApplesAndOranges() {
		Calculations calculations = new Calculations();
		assertEquals(1.70, calculations.calculatePrice(asList("Orange", "Apple", "Apple", "Orange")));
	}
}
