package com.project.mapdemo;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> demo = new ConcurrentHashMap<Integer, String>();
		demo.put(1, "Bangalore");
		demo.put(3, "Tumkur");
		demo.put(8, "Davanagere");
		demo.put(2, "Mysore");
		demo.put(5, "Chitradurga");

		System.out.println("iterating over loop,,,,,,,,,,,,,,,");
		Iterator<Entry<Integer, String>> itr = demo.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
