package com.loop.practise;

import java.util.Scanner;

public class SubtractionQuiz {
	public final int NUMBER_OF_QUESITION = 5;// initialize number of quesition
	public int count = 0;// count for loop
	public int countCorrect = 0;// count for correct answer
	public String output = ""; // initialize empty string
	public long startTime = System.currentTimeMillis();// Starting time
	Scanner input = new Scanner(System.in);// create scanner class object for
											// input answer

	public void quiz() {// method
		while (count < NUMBER_OF_QUESITION) {// starting loop
			int number1 = (int) (Math.random() * 10);// take number1 randomly
			int number2 = (int) (Math.random() * 10);// take number2 randomly
			if (number1 < number2) {// chack number1 and number2 which number is
									// small
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is " + number1 + "-" + number2);
			int answer = input.nextInt();// take answer
			if (number1 - number2 == answer) {// compare answer
				System.out.println("Your answer is correct.");
				countCorrect++;// increase countCorrect
			}
			// if wrong answer
			else {
				System.out.println(
						"Your answer is wrong. " + number1 + "-" + number2 + "should be " + (number1 - number2));
			}
			count++;// increase count
			// show which quiz is correct or wrong
			output += "\n" + number1 + "-" + number2 + "=" + answer
					+ ((number1 - number2 == answer) ? "Correct" : "Wrong");
		}
		// endtime
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;// test time
		System.out.println(
				"Correct answer is " + countCorrect + "\nTest time is " + (testTime / 1000) + "Second's" + output);
	}

}
