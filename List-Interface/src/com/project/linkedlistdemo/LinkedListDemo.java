package com.project.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Samsung");
		list.add("Vivo");
		list.add("Lenovo");
		list.add("Oppo");
		list.add("Iphone");
		list.add("Samsung");
		
		
		System.out.println(list);
		System.out.println("iterating over a for each loop,,,,,,,,,,");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("iterating over iterator interface,,,,,,,,,,,,");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("iterating over list iterator,,,,,,,,,,,,");
		System.out.println("Forward direction,,,,,,,,,,,,,,,");
		ListIterator<String> itr1=list.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Reverse direction,,,,,,,,,,,,,");
		while(itr1.hasPrevious()){
			System.out.println(itr1.previous());
		}
		
	}

}
