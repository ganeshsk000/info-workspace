package com.project.stackdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		java.util.Stack<String> stackdemo=new Stack<String>();
		stackdemo.push("Laptop");
		stackdemo.push("Mobile");
		stackdemo.push("Mouse");
		stackdemo.push("Keyword");
		stackdemo.push("Charger");
		
//		stackdemo.push(null);
//		stackdemo.push(null);
//		stackdemo.pop();
//		stackdemo.pop();
//		stackdemo.pop();
		System.out.println("printing though cammand print,,,,,,,,,,");
System.out.println(stackdemo);	
//		System.out.println(stackdemo.peek());
		System.out.println("iterating over the iterator interface,,,,,,,,,,,,,,,,");
		Iterator<String> itr=stackdemo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
