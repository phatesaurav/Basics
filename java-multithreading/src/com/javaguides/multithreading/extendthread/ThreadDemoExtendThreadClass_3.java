package com.javaguides.multithreading.extendthread;

public class ThreadDemoExtendThreadClass_3 {
	
	public static void main(String[] args) {
		Thread javaThread = new JavaThread();
		javaThread.start(); // internally JVM will call run() method
		
		Thread pythonThread = new PythonThread();
		pythonThread.start(); // internally JVM will call run() method
		
		Thread cThread = new CThread();
		cThread.start(); // internally JVM will call run() method
	}
}
