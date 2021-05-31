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
	
	@Test
	public void mulTest() {

		Assert.assertEquals(200, a1.mul(20, 10));

	}
	
	@Test
	public void divTest() {

		Assert.assertEquals(2, a1.div(20, 10));

	}
}
