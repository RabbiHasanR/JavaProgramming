package com.mine.minefront;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import com.mine.minefront.graphics.Render;
import com.mine.minefront.graphics.Screan;

public class Display extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Minefront P-Alfa 0.01";

	private Thread thread;
	private Screan screan;
	private BufferedImage img;
	private boolean running = false;
	public Render render;
	private int[] pixels;

	public Display() {
		// render = new Render(WIDTH, HEIGHT);
		screan = new Screan(WIDTH, HEIGHT);
		img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
	}

	private void start() {
		if (running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();

		System.out.print("Working...");
	}

	private void stop() {
		if (!running) {
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("stopping...");
	}

	private void tick() {

	}

	public void run() {
		while (running) {
			tick();

			render();

		}

	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		screan.render();

		for (int i = 0; i < WIDTH * HEIGHT; i++) {
			pixels[i] = screan.pixels[i];
		}
		Graphics g = bs.getDrawGraphics();
		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
		g.dispose();
		bs.show();

	}

	public static void main(String[] args) {

		Display game = new Display();
		JFrame jf = new JFrame();
		jf.add(game);
		jf.pack();
		jf.setTitle(TITLE);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGHT);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);
		System.out.println("running.....");

		game.start();

	}

}
