package com.project.lambdausingthreadclass;

public class App {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside the thread,,,,,,,,,,,,,,,,");		
			}
		});
		thread.run();
		//by using lambda expression
		Thread thread1=new Thread(()->System.out.println("inside thread1,,,,,"));
		thread1.run();
		//calling multiple statements by using lambda,,,,,,,,,
		Thread thread2=new Thread(()->{
		System.out.println("inside the thread1,,,,,,,,,,,,,,");
		System.out.println("inside the thread2,,,,,,,,,,,,,,,,,");
		System.out.println("inside the thread3,,,,,,,,,,,,,,,,");		
		});
		thread2.run();
		//calling by start()
		new Thread(()->{
			System.out.println("calling through start method,,,,,,,,,");
			
			
			
		}).start();;
	}

}
