package com.project.lambdademo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Data> list=new ArrayList<Data>();
		list.add(new Data("Rajesh"));
		list.add(new Data("Rajev"));
		list.add(new Data("Moya"));
		list.add(new Data("Gaan"));
		list.add(new Data("Praveen"));
		
		Collections.sort(list,new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
//		Collections.sort(list,(Data o1,Data o2)->o1.getName().compareTo(o2.getName()));
		Collections.sort(list,(Data o1,Data o2)->{
			if(o1.getName().length()<o2.getName().length()) {
				return -1;
			}
				else if(o1.getName().length()>o2.getName().length()) {
					return 1;
					
				}
				else {
					return 0;
			}
});
		
		
		
		for(Data data:list) {
			System.out.println(data.getName());
		}
	}
	

}
