package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {

	@Test
	void testWith101() {
		Discount discount = new Discount();

		double total = discount.applyDiscount(101);

		assertEquals(80.8, total, 0.01);
	}
/*
	@Test
	void testWith100() {
		Discount discount = new Discount();

		double total = discount.applyDiscount(100);

		assertEquals(100.0, total, 0.01);
	}*/
}
