package com.capgemini.test.calculations;

import java.util.List;

public class Calculations {

	public double calculatePrice(List<String> shoppingList) {
		double totalPrice = 0.00;
		for (String item : shoppingList) {
			if (item.equalsIgnoreCase("Apple")) {
				totalPrice += 0.60;
			} else if (item.equalsIgnoreCase("Orange")) {
				totalPrice += 0.25;
			}
		}

		return totalPrice;
	}
}
