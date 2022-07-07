package com.project.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Set<String> setDemo=new TreeSet<String>();
		setDemo.add("Laptop");
		setDemo.add("Computer");
		setDemo.add("Mobile");
		setDemo.add("Table");
		setDemo.add("Bus");
		setDemo.add("Phone");
		setDemo.add("Bus");
		setDemo.add(null);
		setDemo.add(null);
		
		Set<String> setDuplicateContainer=new HashSet<String>();
		setDuplicateContainer.addAll(setDemo);
		System.out.println(setDuplicateContainer);
		
	System.out.println(setDemo.contains("Laptop"));	
		System.out.println(setDemo);
		System.out.println("iterating over iterator()");
		Iterator<String> itr=setDemo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("iterating over for each loop");
		for(String str:setDemo) {
			System.out.println(str);
		}
		
		
	}

}
