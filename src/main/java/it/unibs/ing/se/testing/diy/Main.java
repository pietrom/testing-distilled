package it.unibs.ing.se.testing.diy;

import it.unibs.ing.se.testing.Adder;

public class Main {
	public static void main(String[] args) {
		try {
			addThreeNumbers();
			System.out.println("Test passed");
		} catch (Exception e) {
			System.out.println("Test failure: " + e.getMessage());
		}
	}
	
	public static void addThreeNumbers() throws Exception {
		Adder adder = new Adder();
		int sum = adder.add(11, 17, 19);
		int expected = 47;
		if(sum != expected) {
			throw new Exception(String.format("Expected: %d Found: %d", expected, sum));
		}
	}
}
