package it.unibs.ing.se.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void helloWorld() throws Exception {
		Hello hello = new Hello();
		assertEquals("Hello, World!", hello.sayHello());
	}
	
	@Test
	public void helloPietro() {
		Hello hello = new Hello();
		assertEquals("Hello, Pietro!", hello.sayHelloTo("Pietro"));
	}
	
	@Test
	public void customMessage() throws Exception {
		Hello hello = new Hello("Hi");
		assertEquals("Hi, Pietro!", hello.sayHelloTo("Pietro"));
	}
}
