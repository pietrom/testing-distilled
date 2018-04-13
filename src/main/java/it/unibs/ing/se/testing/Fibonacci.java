package it.unibs.ing.se.testing;

public class Fibonacci {

	public static int compute(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int prev2 = 0;
		int prev = 1;
		int current = 0;
		for(int i = 2; i <= n; i++) {
			current = prev2 + prev;
			prev2 = prev;
			prev = current;
		}
		return current;
	}

}
