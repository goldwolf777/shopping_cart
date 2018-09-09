package com.capgemini.test.calculations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.util.List;

public class ShoppingCartCalculations {
	private final Logger LOG = LoggerFactory.getLogger(ShoppingCartCalculations.class);
	private static final String APPLE = "Apple";
	private static final String ORANGE = "Orange";

	public double calculatePrice(List<String> shoppingList) {
		double totalPrice = 0.00;
		for (String item : shoppingList) {
			if (item.equalsIgnoreCase(APPLE)) {
				totalPrice += 0.60;
			} else if (item.equalsIgnoreCase(ORANGE)) {
				totalPrice += 0.25;
			} else {
				LOG.info("Item in the shopping list is unknown: {}", item);
			}
		}

		return decimalPlaceFormatter(totalPrice);
	}

	private Double decimalPlaceFormatter(Double doubleToFormat) {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		return Double.valueOf(decimalFormat.format(doubleToFormat));
	}
}
