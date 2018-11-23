package com.dj.threads;
/**
 * Thread safe
 * @author Blau9
 *
 */
public class Thread05 {
	public static void main(String[] args) throws InterruptedException {
		class CountSafe{
			private int count;
			/**public void incremenet() {
				synchronized (this) {
					count=count+1;	
				}
			} ==*/
			public synchronized void incremenet() {
				count=count+1;	
			}
			public synchronized int getCount() {
				return count;
			}
		}
		
		CountSafe count = new CountSafe();
		class ThreadTest01 extends Thread{
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					count.incremenet();
				}
			}
		}
		
		Runnable r=()->{
			for(int i=0;i<1000;i++) {
				count.incremenet();
			}
		};
			
		new ThreadTest01().start();
		new Thread(r).start();
		
		Thread.sleep(100);
		for(int i=0;i<1000;i++) {
			count.incremenet();
		}
		
		System.out.println(count.getCount());
			
	}
}

