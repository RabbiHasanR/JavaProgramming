package com.recursion.practise;

public class RecursionExample {
	// Fibonacci number
	public static int n1 = 0, n2 = 1, n3 = 0;

	public static void fibonacci(int num) {
		if (num > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" " + n3);
			fibonacci(num - 1);
		}
	}

}
