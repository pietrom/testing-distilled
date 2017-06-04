package it.unibs.ing.se.testing;

public class FizzBuzzV2 {
	private final Fizzer fizzer;
	private final Buzzer buzzer;
	
	public FizzBuzzV2(Fizzer fizzer, Buzzer buzzer) {
		this.fizzer = fizzer;
		this.buzzer = buzzer;
	}

	public String play(int i) {
		if(i % 15 == 0) {
			return fizzer.fizz() + buzzer.buzz();
		}
		if(i % 5 == 0) {
			return buzzer.buzz();
		}
		if(i % 3 == 0) {
			return fizzer.fizz();
		}
		return Integer.toString(i);
	}
}
