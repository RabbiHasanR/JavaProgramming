package com.game.gameProgrammingPractise;

public class Multi extends Thread {
	public void run() {
		// System.out.println("Running....");
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
