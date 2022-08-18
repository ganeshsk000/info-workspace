package com.project.methodreference;

import java.time.LocalDate;

public class Stuff {
	public static void doTask() {
		System.out.println("I am doing task,,,,,,,,,,,");
		System.out.println("this is second line,,,,,,,,");
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
	}

	public static void threadTask() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void printNumber() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
}
