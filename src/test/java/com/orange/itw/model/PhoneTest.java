package com.orange.itw.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class PhoneTest {

	@Test
	public void getPrice() throws Exception {
		Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);
		
		assertEquals(iphone7.getPrice(), 749,9f);
	}

}