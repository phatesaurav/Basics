package com.javaguides.multithreading.extendthread;

public class CThread extends Thread {

	@Override
	public void run() {
		// Thread 3
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " C Programming");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
