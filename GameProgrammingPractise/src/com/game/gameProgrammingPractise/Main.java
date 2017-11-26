package com.game.gameProgrammingPractise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RunnableDemo r1 = new RunnableDemo("Thread-1");
		// r1.start();

		// RunnableDemo r2 = new RunnableDemo("Thread-2");
		// r2.start();
		Multi m = new Multi();

		Multi m1 = new Multi();
		Multi m2 = new Multi();
		// m.start();
		m.start();
		try {
			m.join(1000);
		} catch (Exception e) {

		}
		m1.start();
		m2.start();
		// m.run();
		// m1.run();

	}

}
