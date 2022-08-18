package com.project.demo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//create a list and filter all even numbers from list
		//one way
		List<Integer> list1=List.of(2,1,3,4,6,8,7,22);
		//second way
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(23);
		list2.add(50);
		list2.add(52);
		list2.add(36);
		list2.add(43);
		//third way
		Arrays.asList(12,13,14,15,16,17,18);
		
		//List1 without stream
		List<Integer> evenList=new ArrayList<Integer>();
		for(Integer i:list1) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(evenList);
		
		//using Strem
		Stream<Integer> stream=list1.stream();
		List<Integer>news=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(news);
		
		
		//using streams
		List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		List<Integer>newList1=list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newList1);
		
		
		
	}

}
