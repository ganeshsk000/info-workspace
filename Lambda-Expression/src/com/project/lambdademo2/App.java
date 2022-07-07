package com.project.lambdademo2;

public class App {
	public static void main(String[] args) {
		Lambda lambda=(int a,float y)->{
		System.out.println("The value of a is: "+a+" the value of y is: "+y);	
		};
		lambda.demo(10, 125.5f);
	}

}
