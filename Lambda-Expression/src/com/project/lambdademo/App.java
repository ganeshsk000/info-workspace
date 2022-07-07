package com.project.lambdademo;

public class App {
	public static void main(String[] args) {
	/*	Lambda lambda=new Lambda() {
			
			@Override
			public void demo() {
				System.out.println("statement,,,,,,,,,,,,,,,,1");
				System.out.println("statement,,,,,,,,,,,,,,,,,,,2");
				
			}
		};
		lambda.demo();*/
		//to print multiple statement
	/*	Lambda lambda=()->{
			
			
			System.out.println("Statement,,,,,,,,,,,,,,,1");
			System.out.println("statement,,,,,,,,,,,,,,,,2");
			System.out.println("statement,,,,,,,,,,,,,,,,,,,,,3");
		};
		lambda.demo();*/
		Lambda lambda=(()->System.out.println("statement,,,,,,,,,,,1"));
		lambda.demo();
	}

}
