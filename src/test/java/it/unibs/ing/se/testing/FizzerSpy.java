package it.unibs.ing.se.testing;

public class FizzerSpy implements Fizzer {
	private boolean wasInwoked = false;
	
	public boolean wasInvoked() {
		return wasInwoked;
	}

	@Override
	public String fizz() {
		wasInwoked = true;
		return "fake";
	}
}
