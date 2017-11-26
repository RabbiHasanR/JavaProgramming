package com.game.gameProgrammingPractise;

public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating: " + threadName);
	}

	public void run() {
		System.out.println("Running: " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + "," + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			System.out.println("Thread: " + threadName + "interrupted");
		}
		System.out.println("Thread: " + threadName + "existing");
	}

	public void start() {
		System.out.println("Starting: " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
