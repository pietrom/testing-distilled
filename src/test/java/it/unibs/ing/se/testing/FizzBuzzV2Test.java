package it.unibs.ing.se.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzV2Test {
	@Test
	public void shouldInvokeFizzerWhenInputIs3() throws Exception {
		Fizzer fizzer = new FizzerSpy();
		Buzzer buzzer = new BuzzerSpy();
		FizzBuzzV2 sut = new FizzBuzzV2(fizzer, buzzer);
		sut.play(3);
		assertTrue(((FizzerSpy)fizzer).wasInvoked());
	}
	
	@Test
	public void shouldNotInvokeBuzzerWhenInputIs3() throws Exception {
		Fizzer fizzer = new FizzerSpy();
		Buzzer buzzer = new BuzzerSpy();
		FizzBuzzV2 sut = new FizzBuzzV2(fizzer, buzzer);
		sut.play(3);
		assertFalse(((BuzzerSpy)buzzer).wasInvoked());
	}
	
	@Test
	public void shouldInvokeFizzerAndBuzzerWhenInputIs15() throws Exception {
		Fizzer fizzer = new FizzerSpy();
		Buzzer buzzer = new BuzzerSpy();
		FizzBuzzV2 sut = new FizzBuzzV2(fizzer, buzzer);
		sut.play(15);
		assertTrue(((FizzerSpy)fizzer).wasInvoked());
		assertTrue(((BuzzerSpy)buzzer).wasInvoked());
	}
}
