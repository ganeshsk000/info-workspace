package com.project.accessmodifier1;

import com.project.accessmodifier.Train;

public class Tester extends Train {
	public static void main(String[] args) {
		Tester train = new Tester();
		
		System.out.println(train.getId()+ " "+ train.getName()+" "+train.getColor());
		System.out.println(train.id);
		System.out.println(train.name);
		System.out.println(train.color);
	}

}
