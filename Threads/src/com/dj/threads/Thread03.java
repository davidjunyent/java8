package com.dj.threads;

/**
 * wihout synchronized
 * 
 * @author Blau9
 *
 */
public class Thread03 {
	public static Count count = new Count();

	public static void main(String[] args) {
		class ThreadTest01 extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					count.incremenet();
				}
			}
		}

		Runnable r = () -> {
			for (int i = 0; i < 1000; i++) {
				count.incremenet();
			}
		};

		new ThreadTest01().start();
		new Thread(r).start();
		for (int i = 0; i < 1000; i++) {
			count.incremenet();
		}
	}
}

class Count {
	private int count = 0;

	public void incremenet() {
		count = count + 1;
	}

	public int getCount() {
		return count;
	}
}
