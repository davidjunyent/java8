package com.dj.threads;

/**
 * deadlock
 * 
 * @author Blau9
 *
 */
public class Thread06 {

	public static void main(String args[]) {
		for (int i = 0; i < 1000; i++) {
			new Thread06().deadLocckExample();
		}
	}

	public void deadLocckExample() {
		Object monitor1 = new Object();
		Object monitor2 = new Object();

		Count count1 = new Count();
		Count count2 = new Count();

		new Thread(() -> {
			synchronized (monitor1) {
				count1.incremenet();
				synchronized (monitor2) {
					count2.incremenet();
				}
			}
		}

		).start();

		synchronized (monitor2) {
			count2.incremenet();
			synchronized (monitor1) {
				count1.incremenet();
			}
		}
	}
}
