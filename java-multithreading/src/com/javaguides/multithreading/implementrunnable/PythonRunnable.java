package com.javaguides.multithreading.implementrunnable;

public class PythonRunnable implements Runnable {

	@Override
	public void run() {
		// Thread 2
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Python Programming");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
