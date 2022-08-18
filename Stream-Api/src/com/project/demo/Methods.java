package com.project.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		// filter(Pridicate)->it returns true or false
		// boolean value funstion
		// e->e>10

		// map(Function)
		/*
		 * map() works on each element each element operation
		 * 
		 * 
		 */
		List<String> list = List.of("Ganesh", "guruprasad", "Kotresh","Gagan");
		list.stream().filter(e -> e.startsWith("G")).forEach(e -> System.out.println(e));
		// by using coller()
		List<String> newList = list.stream().filter(e -> e.startsWith("G")).collect(Collectors.toList());
		System.out.println(newList);
	}

}
