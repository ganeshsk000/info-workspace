package com.project.lambda;

import java.util.concurrent.Callable;
//runnable,collable, these are functional interface,,,,,,,,
public class Main {

	public static void main(String[] args) {
		System.out.println("Lambda expresiions,,,,,,,,,,");
//		MyInterImpl impl=new MyInterImpl();
//		impl.sayHello();
		
		MyInter intr=new MyInter() {
			//a class having no name ,,we call it as as ananymous class,,,,,,,,
			@Override
			public void sayHello() {
				System.out.println("this is first anaoysis class,,,,,,,,,,,");
				
			}
		};
		intr.sayHello();
//using our interface by using lambda,,,,,,,,,,
		MyInter lambda=()->{
			System.out.println("Hi all,,,,,,,,,,,,,,,,,,,,");
			System.out.println("Helo bhai,,,,,,,,,,,,,,,");
		};
		lambda.sayHello();
		StringInterface st=(str->str.length());
		
		System.out.println(st.getLength("fdsfsdfsgfsedfsewe"));
	}
	
	

}
