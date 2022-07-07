package com.project.demo;

public class App {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					System.out.println(i);
				}
				
			}
		}).start();;
	
	}

}
