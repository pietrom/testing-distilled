package it.unibs.ing.se.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdderSecondTest {
	private Adder adder;
	@Before
	public void initializeAdder() {
		adder = new Adder();
	}
	@Test
	public void shouldAddThreeIntegers() throws Exception {
		int result = adder.add(11, 17, 19);
		assertEquals(47, result);
	}
	
	@Test
	public void sumOfZeroIntegersIsZero() throws Exception {
		int result = adder.add();
		assertEquals(0, result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenInvokedWithNullParameter() {
		new Adder().add(null, 10);
	}
}
