package com.project.demo;

public class App {
	public static void main(String[] args) {
		Bracket b=new Bracket();
//		b.generate();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					b.generate();
				}
				
			}
		}).start();
new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					b.generate();
				}
				
			}
		}).start();
	}

}
