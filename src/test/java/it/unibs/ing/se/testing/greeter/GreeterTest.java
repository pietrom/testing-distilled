package it.unibs.ing.se.testing.greeter;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class GreeterTest {
	@Test
	public void defaultIsHelloWorld() throws Exception {
//		assertEquals("Hello, World!", new Greeter().greet());
		assertThat(new Greeter().greet(), is("Hello, World!"));
	}
	
	@Test
	public void canSpecifyGreetingsDestination() throws Exception {
//		assertEquals("Hello, Pietro!", new Greeter().greet("Pietro"));
		assertThat(new Greeter().greet("Pietro"), is("Hello, Pietro!"));
	}
	
	@Test
	public void canSpecifyCustomMessage() throws Exception {
//		assertEquals("Hi, Pietro!", new Greeter("Hi").greet("Pietro"));
		assertThat(new Greeter("Hi").greet("Pietro"), is("Hi, Pietro!"));
	}
	
	@Test
	public void destinationShouldBeCapitalized() throws Exception {
//		assertEquals("Hi, Friend!", new Greeter("Hi").greet("friend"));
		assertThat(new Greeter("Hi").greet("friend"), is("Hi, Friend!"));
	}
	
	@Test
	public void destinationShouldBeTrimmed() throws Exception {
//		assertEquals("Hi, Pietro!", new Greeter("Hi").greet("  Pietro "));
		assertThat(new Greeter("Hi").greet("  Pietro "), is("Hi, Pietro!"));
	}
	
	@Test
	public void canUseExternalMessageSource() throws Exception {
		MessageSource messageSource = new FixedMessageSource("Hola");
		assertThat(new Greeter(messageSource).greet(), is("Hola, World!"));
	}	
}
