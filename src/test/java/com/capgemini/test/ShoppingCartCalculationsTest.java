package com.capgemini.test;

import com.capgemini.test.calculations.ShoppingCartCalculations;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartCalculationsTest {

	@Test
	void calculateThePriceForOneApple() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.60, shoppingCartCalculations.calculatePrice(asList("Apple")));
	}

	@Test
	void calculateThePriceForOneOrange() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.25, shoppingCartCalculations.calculatePrice(asList("Orange")));
	}

	@Test
	void calculateThePriceForOneOrangeAndOneApple() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.85, shoppingCartCalculations.calculatePrice(asList("Orange", "Apple")));
	}

	@Test
	void calculateThePriceForMultipleApplesAndOranges() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1.70, shoppingCartCalculations.calculatePrice(asList("Orange", "Apple", "Apple", "Orange")));
	}

	@Test
	void shouldntCalculateUnknownItem() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.00, shoppingCartCalculations.calculatePrice(asList("Applllle")));
	}

}
