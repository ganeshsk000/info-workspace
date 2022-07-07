package com.project.setdemo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Set<School> schoolContainer=new HashSet<School>();
		schoolContainer.add(new School(1, "Saptagiri", 9833465736l, "Bangalore"));
		schoolContainer.add(new School(2, "St marys", 983465735l, "Mysore"));
		schoolContainer.add(new School(3, "Govt School", 9824654778l, "Davanagere"));
		schoolContainer.add(new School(4, "Sri durga", 475436458644l, "tumkur"));
		schoolContainer.add(new School(5, "littile paris", 91353757845l, "Hiriyur"));
		schoolContainer.add(new School(1, "Saptagiri", 9833465736l, "Bangalore"));
		
		System.out.println("iterating over for each loop");
		for(School sch:schoolContainer) {
			System.out.println(sch);
		}
		System.out.println("iterating over iterator ()");
		Iterator<School> itr=schoolContainer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
