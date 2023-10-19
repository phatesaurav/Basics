package com.javaguides.multithreading;

public class ThreadOverview_1 {

	public static void main(String[] args) throws InterruptedException {
		// InterruptedException => Thrown when a thread is waiting, sleeping, or
		// otherwise occupied,and the thread is interrupted, either before or during the
		// activity.

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Java Programming");
			Thread.sleep(2000);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Python Programming");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " C Programming");
		}

	}

}
