package it.unibs.ing.se.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {
	@Parameters(name="f({0}) = {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }, { 8, 21 } });
	}

	private int input;
	private int expected;

	public FibonacciTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void test() {
		assertEquals(expected, Fibonacci.compute(input));
	}
}
