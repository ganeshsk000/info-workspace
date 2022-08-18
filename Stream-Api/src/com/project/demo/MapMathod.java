package com.project.demo;

import java.util.List;
import java.util.stream.Collectors;

public class MapMathod {
	public static void main(String[] args) {
		List<Integer> list = List.of(23,25,27,20);
		list.stream().map(i->i*i).forEach(i->System.out.println(i));
		List<Integer> newList = list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newList);
		//method reference
		list.stream().forEach(System.out::println);
		System.out.println("*********************");
		//sort method
		list.stream().sorted().forEach(System.out::println);
		//minimum method
		System.out.println("**************************");
		Integer minimumNumber = list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(minimumNumber);
		//maximum method
		Integer MaximumNumber = list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(MaximumNumber);
	}

}
