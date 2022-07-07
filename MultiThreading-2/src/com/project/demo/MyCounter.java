package com.project.demo;
//this thread sequence is based on the hardware specification and the jvm will manages this thread cycle
//thread cycle sequence definetly change beacause of hardware specifications,,,,,,,,,,,
public class MyCounter implements Runnable {
	private int threadNo;
	
	

	public MyCounter() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "MyCounter [threadNo=" + threadNo + "]";
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("the vale of i is: "+i+"the vale of ThreadNo: "+threadNo);
		}
		
	}
	
	

}
