package it.unibs.ing.se.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {
	@Test
	public void shouldAddThreeIntegers() throws Exception {
		Adder adder = new Adder();
		int result = adder.add(11, 17, 19);
		assertEquals(47, result);
	}
}
