package com.dj.threads;

/**
 * wiht synchronized
 * 
 * @author Blau9
 *
 */
public class Thread04 {
	public static Object monitor = new Object();
	public static Count count = new Count();

	public static void main(String[] args) {
		class ThreadTest01 extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					synchronized (monitor) {
						count.incremenet();
					}

				}
			}
		}

		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				synchronized (monitor) {
					count.incremenet();
				}
			}
		};

		new ThreadTest01().start();
		new Thread(r).start();

		for (int i = 0; i < 1000; i++) {
			synchronized (monitor) {
				count.incremenet();
			}
		}
	}
}
