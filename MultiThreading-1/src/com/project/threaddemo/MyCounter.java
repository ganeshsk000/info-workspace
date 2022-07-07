package com.project.threaddemo;

public class MyCounter extends Thread {
	private int threadNo;

	public MyCounter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void countMe() {
		for(int i=1;i<=10;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the value of i is: "+i+" the value of ThreadNo: "+threadNo);
		}
		
		
	}
	@Override
	public void run() {
		countMe();
		super.run();
	}
	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	public int getThreadNo() {
		return threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}
	
	

}
