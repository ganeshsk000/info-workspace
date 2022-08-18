	package com.project.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		//stream api-collection process
		//collection-group of objects
		
		//1-blank stream
		Stream<Object> emptyStream = Stream.empty();	
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		//2-Array,collection,objects
		String names[]= {"Ganesh","Guru","Kotresh","Rakesh"};
		Stream<String> Stream1 = Stream.of(names);
		Stream1.forEach(e->{
			System.out.println(e);
		});
		//Stream builder
		Stream<Object> builder = Stream.builder().build();
		//ananymus array
		IntStream stream = Arrays.stream(new int[] {30,50,33,25,67});
		stream.forEach(e->{
			System.out.println(e);
		});
		System.out.println("***************************");
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(23);
		list2.add(50);
		list2.add(52);
		list2.add(36);
		list2.add(43);
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
	}

}
