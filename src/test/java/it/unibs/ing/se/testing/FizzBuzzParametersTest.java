package it.unibs.ing.se.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FizzBuzzParametersTest {
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, "1" }, { 2, "2" }, { 3, "fizz" }, { 4, "4" }, { 5, "buzz" },
				{ 15, "fizzbuzz" } });
	}

	private int input;
	private String expected;

	public FizzBuzzParametersTest(int input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void playNumber_withAnyNumber_returnsTheCorrectNumber() {
		String result = new FizzBuzz().play(input);
		assertEquals(expected, result);
	}
}
