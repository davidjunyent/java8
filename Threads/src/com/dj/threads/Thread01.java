package com.dj.threads;
/**
 * extends Thread
 * @author Blau9
 *
 */
public class Thread01 {
	private static final int SLEEP=10;
	public static void main(String[] args) {
		
		class ThreadTest01 extends Thread{
			public String name;
			public ThreadTest01(String name) {
				this.name=name;
			}
			@Override
			public void run() {
				for(int i=0;i<=100;i++) {
					System.out.println("In Thread "+name);
					try {
						Thread.sleep(SLEEP);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		new ThreadTest01("Number 1").start();
		new ThreadTest01("Number 2").start();
		
		for(int i=0;i<=100;i++) {
			System.out.println("In main");
			try {
				Thread.sleep(SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

