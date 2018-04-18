package it.unibs.ing.se.testing.greeter;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class RoundRobinMessageSourceTest {
	@Test
	public void singleCall() throws Exception {
		MessageSource sut = new RoundRobinMessageSource("Hola", "Hi", "Hello", "Salve");
		assertThat(sut.nextMessage(), is("Hola"));
	}
	
	@Test
	public void multipleCalls() throws Exception {
		MessageSource sut = new RoundRobinMessageSource("Hola", "Hi", "Hello", "Salve");
		assertThat(sut.nextMessage(), is("Hola"));
		assertThat(sut.nextMessage(), is("Hi"));
		assertThat(sut.nextMessage(), is("Hello"));
	}
	
	@Test
	public void restartAfterLastMessage() throws Exception {
		MessageSource sut = new RoundRobinMessageSource("Hola", "Hi", "Hello", "Salve");
		sut.nextMessage();
		sut.nextMessage();
		sut.nextMessage();
		sut.nextMessage();
		assertThat(sut.nextMessage(), is("Hola"));
		
	}
}
