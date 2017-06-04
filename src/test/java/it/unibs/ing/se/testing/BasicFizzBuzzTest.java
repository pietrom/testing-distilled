package it.unibs.ing.se.testing;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicFizzBuzzTest {
	private FizzBuzz sut;
	
	@Before
	public void initSut() {
		sut = new FizzBuzz();
	}
	
	@Test
	public void shouldRetursFizzWhenInputIs3() {
		assertEquals("fizz", sut.play(3));
	}
}
