package com.capgemini.test.main;

import com.capgemini.test.calculations.ShoppingCartCalculations;

import java.util.Arrays;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		ShoppingCartCalculations shoppingCartCalculations = new ShoppingCartCalculations();
		if (args[0] != null && args[0] != "") {
			List<String> shoppingList = Arrays.asList(args[0].split(","));
			System.out.print("Total Price for this shopping is:" + shoppingCartCalculations.calculatePrice(shoppingList));
		} else {
			System.out.print("Please add the list or apples and oranges as an argument");
		}

	}
}
