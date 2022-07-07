package com.project.appdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Raghav");
		list.add("Ravi");
		list.add("Sachin");
		list.add("Sagar");
		list.add("Raveesh");
		list.add("Rajesh");
		list.add("Ganesh");
		list.add("Ganesh");
		
	/*	System.out.println(list.isEmpty());
		System.out.println(list.hashCode());
		System.out.println(list.get(3));
		System.out.println(list.hashCode());*/
		
		
		System.out.println("iterating over for each loop");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("iterating over iterator interface,,,,,,,,,,,,,,");
		Iterator<String> itr=list.iterator();
		/*	System.out.println(list);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} */
	}

}
