package com.project.constructorreference;

import java.util.List;

public class StreamMain {
	public static void main(String[] args) {
		List<Integer> container = List.of(12,15,17,2,6);
//		System.out.println(container);
//		container.stream().forEach(e->System.out.println(e));
		container.stream().forEach(System.out::println);
	}

}
