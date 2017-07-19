package com.orange.itw.model;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;

public class PhoneTest {

	@Test
	public void shouldGetPrice() throws Exception {
		Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);

		assertThat(iphone7.getPrice(), is(749.9f));
	}

    @Test
	public void shouldGetDiscountedPriceWhenThereIsNoDiscount() throws Exception {
		Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);

		assertThat(iphone7.getDiscountedPrice(), is(iphone7.getPrice()));
	}

    @Test
	public void shouldGetDiscountedPriceWhenThereIsOneDiscount() throws Exception {
		Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);
		LocalDateTime now = LocalDateTime.now();
		Discount promo10 = new Discount(now.minusDays(2), now.plusDays(10), 10f);
		iphone7.getDiscounts().add(promo10);

		assertThat(iphone7.getDiscountedPrice(), is(739.9f));
	}

    @Test
	public void shouldGetDiscountedPriceWhenThereIsMultipleDiscount() throws Exception {
		Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);
		LocalDateTime now = LocalDateTime.now();
		Discount invalidPromo10 = new Discount(now.plusDays(2), now.plusDays(8), 10f);
		Discount promo20 = new Discount(now.minusDays(2), now.plusDays(10), 20f);
		Discount promo30 = new Discount(now.minusDays(2), now.plusDays(10), 30f);
		iphone7.getDiscounts().add(invalidPromo10);
		iphone7.getDiscounts().add(promo20);
		iphone7.getDiscounts().add(promo30);

		assertThat(iphone7.getDiscountedPrice(), is(729.9f));
	}

    @Test
    public void shouldGetDiscountedPriceWhenThereIsNotCompleteDiscount() throws Exception {
        Phone iphone7 = new Phone("iPhone 7", "Apple", 749.9f);
        Discount promo99 = new Discount(null, null, 99f);
        iphone7.getDiscounts().add(promo99);

        assertThat(iphone7.getDiscountedPrice(), is(iphone7.getPrice()));
    }

}