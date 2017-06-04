package it.unibs.ing.se.testing;

public class Adder {
	public int add(Integer ... inputs) {
		int sum = 0;
		for (Integer i : inputs) {
			if(i == null) {
				throw new IllegalArgumentException("Can't sum nulls");
			}
			sum += i;
		}
		return sum;
	}
}
