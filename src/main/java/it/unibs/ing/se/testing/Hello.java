package it.unibs.ing.se.testing;

public class Hello {
	private String msg;

	public Hello(String msg) {
		this.msg = msg;
	}

	public Hello() {
		this("Hello");
	}
	
	public String sayHello() {
		return sayHelloTo("World");
	}

	public String sayHelloTo(String to) {
		return String.format("%s, %s!", msg, to);
	}
}
