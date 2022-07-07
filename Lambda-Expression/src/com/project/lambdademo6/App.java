package com.project.lambdademo6;

import java.util.function.IntPredicate;

public class App {
	public static void main(String[] args) {
		IntPredicate lessThan=i->i<18;
		IntPredicate moreThan=i->i>10;
		
		System.out.println(lessThan.or(moreThan).test(15));
		
	}

}
