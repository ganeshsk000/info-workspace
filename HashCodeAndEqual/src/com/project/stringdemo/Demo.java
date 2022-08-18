package com.project.stringdemo;

public class Demo {
	public static void main(String[] args) {
		String str=new String("Ganesh");
		String str1=new String("Ganesh");
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
	}

}
