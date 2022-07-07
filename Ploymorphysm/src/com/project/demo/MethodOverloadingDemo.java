package com.project.demo;

public class MethodOverloadingDemo {
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers: "+sum);
	}
	public void add(int a,int b ,int c) {
		int sum=a+b+c;
		System.out.println("Addition of three numbers: "+sum);
	}

}
