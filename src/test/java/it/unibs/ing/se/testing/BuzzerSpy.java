package it.unibs.ing.se.testing;

public class BuzzerSpy implements Buzzer {
	private boolean wasInwoked = false;
	
	public boolean wasInvoked() {
		return wasInwoked;
	}

	@Override
	public String buzz() {
		wasInwoked = true;
		return "fake";
	}
}
