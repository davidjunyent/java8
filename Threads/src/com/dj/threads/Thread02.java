package com.dj.threads;
/**
 * implmentes Runnable
 * @author Blau9
 *
 */
public class Thread02 {
	private static final int SLEEP=10;
	public static void main(String[] args) {
		
		class RunnableTest02 implements Runnable{
			public String name;
			public RunnableTest02(String name) {
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
		new Thread(new RunnableTest02("Number 1")).start();
		new Thread(new RunnableTest02("Number 2")).start();
		
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

