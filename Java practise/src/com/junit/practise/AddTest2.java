package com.junit.practise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest2 {

	@Test
	public void test() {
		MyClass mc = new MyClass();
		String result = mc.addString("Rabbi", "Hasan");
		assertEquals("RabbiHasan", result);
	}

}
