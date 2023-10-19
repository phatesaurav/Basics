package com.javaguides.multithreading.implementrunnable;

public class ThreadDemoImplementRunnableInterface_2 {

	public static void main(String[] args) {
//		Runnable runnableJava = new JavaRunnable();
//		Thread thread = new Thread(runnableJava);
//		thread.start();

		new Thread(new JavaRunnable()).start(); // internally JVM will call run() method
		new Thread(new PythonRunnable()).start(); // internally JVM will call run() method
		
		// Same using lambda expression by replacing 'new CThread()' with () -> {function body}
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " C Programming");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start(); // internally JVM will call run() method
	}

}
