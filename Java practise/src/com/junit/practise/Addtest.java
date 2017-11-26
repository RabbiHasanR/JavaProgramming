package com.junit.practise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addtest {

	@Test
	public void test() {

		MyClass mc = new MyClass();
		int result = mc.add(100, 200);
		assertEquals(300, result);

	}

}
