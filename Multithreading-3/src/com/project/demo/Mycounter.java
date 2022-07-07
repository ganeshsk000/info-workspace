package com.project.demo;
//thread creation by using runnable interface,,,,,,,,,,,,,
public class Mycounter implements Runnable {
	
	private int threadNo;
	
	

	public Mycounter() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Mycounter(int threadNo) {
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
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
