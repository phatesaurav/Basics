package com.javaguides.multithreading.extendthread;

public class JavaThread extends Thread {

	@Override
	public void run() {
		// Thread 1
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Java Programming");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
