package com.csi;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticApplicationTest {

	ArithmeticApplication a1 = new ArithmeticApplication();

	@Test
	public void addTest() {

		Assert.assertEquals(9, a1.add(4, 5));

	}
	@Test
	public void subTest() {

		Assert.assertEquals(10, a1.sub(20, 10));

	}
}
