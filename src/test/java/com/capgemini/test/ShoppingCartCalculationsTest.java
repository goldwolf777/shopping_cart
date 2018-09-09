package com.capgemini.test;

import com.capgemini.test.calculations.ShoppingCartCalculations;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartCalculationsTest {

//	@Test
//	void calculateThePriceForOneApple() {
//		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
//		assertEquals(0.60, shoppingCartCalculations.calculatePrice(asList("Apple")));
//	}
//
//	@Test
//	void calculateThePriceForOneOrange() {
//		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
//		assertEquals(0.25, shoppingCartCalculations.calculatePrice(asList("Orange")));
//	}
//
//@Test
//void calculateThePriceForOneOrangeAndOneApple() {
//	ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
//	assertEquals(0.85, shoppingCartCalculations.calculatePrice(asList("Orange", "Apple")));
//}
//
//	@Test
//	void calculateThePriceForMultipleApplesAndOranges() {
//		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
//		assertEquals(1.70, shoppingCartCalculations.calculatePrice(asList("Orange", "Apple", "Apple", "Orange")));
//	}

	@Test
	void shouldntCalculateUnknownItem() {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.00, shoppingCartCalculations.calculatePrice(asList("Applllle")));
	}


	@Test
	void calculateBuyOneAppleGetOneFree() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.60, ShoppingCartCalculations.calculatePrice(asList("Apple", "Apple")));
	}

	@Test
	void calculateBuyOneAppleGetOneFreeThreeApples() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1.20, ShoppingCartCalculations.calculatePrice(asList("Apple", "Apple", "Apple")));
	}

	@Test
	void calculateBuyOneAppleGetOneFreeFourApples() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1.20, ShoppingCartCalculations.calculatePrice(asList("Apple", "Apple", "Apple", "Apple")));
	}

	@Test
	void calculateThreeForAPriceOfTwoWithThreeOranges() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.50, ShoppingCartCalculations.calculatePrice(asList("Orange", "Orange", "Orange")));
	}

	@Test
	void calculateThreeForAPriceOfTwoWithTwoOranges() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(0.50, ShoppingCartCalculations.calculatePrice(asList("Orange", "Orange")));
	}

	@Test
	void calculateThreeForAPriceOfTwoWithFiveOranges() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1, ShoppingCartCalculations.calculatePrice(asList("Orange", "Orange", "Orange", "Orange", "Orange")));
	}

	@Test
	void calculateThreeForAPriceOfTwoWithSixOranges() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1, ShoppingCartCalculations.calculatePrice(asList("Orange", "Orange", "Orange", "Orange", "Orange", "Orange")));
	}

	@Test
	void calculateThreeForAPriceOfTwoWithThreeOrangesAndBuyOneGetOneFreeApple() {
		ShoppingCartCalculations ShoppingCartCalculations = new ShoppingCartCalculations();
		assertEquals(1.10, ShoppingCartCalculations.calculatePrice(asList("Orange", "Orange", "Orange", "Apple", "Apple")));
	}


}
