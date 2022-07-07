package com.project.threaddemo;

public class App {
	public static void main(String[] args) {
		MyCounter counter1=new MyCounter(1);
		MyCounter counter2=new MyCounter(2);
		
	/*	long starttime=System.currentTimeMillis();
		counter1.countMe();
		counter2.countMe();
		long endTime=System.currentTimeMillis();
		System.out.println("Total time required: "+(endTime-starttime));*/
/*		long startTime=System.currentTimeMillis();
		counter1.run();
		counter2.run();
		long endTime=System.currentTimeMillis();
		System.out.println("total time to required for thread execution: "+(endTime-startTime));*/
		long starttime=System.currentTimeMillis();
		counter1.start();
		counter2.start();
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endtime=System.currentTimeMillis();
		System.out.println("total time: "+(endtime-starttime));
	}

}
