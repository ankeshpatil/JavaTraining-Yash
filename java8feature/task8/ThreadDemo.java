package com.yash.java8feature.task8;
/*
 * WAP to implements quick sort algorithm using lambda expression. 
 */
/**
 * 
 * @author ankesh.patil
 *
 */

	public class ThreadDemo {
		public static void main(String[] args) {

			// First Thread Demo

			Runnable thread1 = () -> {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Value Of I Is " + i);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};

			Thread t = new Thread(thread1);
			t.setName("Bhushan");
			t.start();

			Runnable thread2 = () -> {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i * 2);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			
			Thread t2=new Thread(thread2);
			t2.setName("TableThread");
			t2.start();
		}
	}



