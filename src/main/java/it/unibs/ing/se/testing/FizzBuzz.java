package it.unibs.ing.se.testing;

public class FizzBuzz {

	public String play(int i) {
		if(i % 15 == 0) {
			return "fizzbuzz";
		}
		if(i % 5 == 0) {
			return "buzz";
		}
		if(i % 3 == 0) {
			return "fizz";
		}
		return Integer.toString(i);
	}
}
