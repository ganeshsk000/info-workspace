package com.project.methodreference;

public class ReferenceDemo {
	public static void main(String[] args) {
		System.out.println("Learning method reference,,,,,,,,,,,,,,");
		//provide implemenation of workinter
		WorkInter inter=()->System.out.println("this is do task of new task");
		inter.doTask();
		//we refer static method by using method reference
		WorkInter inter1=Stuff::doTask;
		inter1.doTask();
		Runnable runnable=Stuff::threadTask;
		Thread t1=new Thread(runnable);
		t1.start();
		//referring non-static method
		Stuff obj=new Stuff();
		Runnable runnable1=obj::printNumber;
		Thread t2=new Thread(runnable1);
		t2.start();
	}

}
