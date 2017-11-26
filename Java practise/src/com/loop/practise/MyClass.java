package com.loop.practise;

public class MyClass {
	public int sum = 0;
	public int num;
	public double avg;

	public MyClass(int num) {
		this.num = num;
	}

	public void negativeOrPositive() {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("positive value: " + i);

			} else {
				System.out.println("negative value: " + i);
			}
			sum = sum + i;

		}
		System.out.println("Total Sum: " + sum);
		avg = sum / num;
		System.out.println("Avareg value: " + avg);

	}

}
