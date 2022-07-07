package com.project.lambdademo3;

public class App {
	public static void main(String[] args) {
		Lambda lambda=()->{
			System.out.println("we will return something for the demo()");
			return 10;
		};
		System.out.println(lambda.demo());
	}

}
