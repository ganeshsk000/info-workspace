package com.project.demo;

public class App {
	public static void main(String[] args) {
		Thread thread1=new Thread(new MyCounter(1));
		Thread thread2=new Thread(new MyCounter(2));
		thread1.start();
		thread2.start();
		
	}

}
