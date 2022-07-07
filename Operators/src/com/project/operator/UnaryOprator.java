package com.project.operator;

public class UnaryOprator {
	public static void main(String[] args) {
		int i=2;
		int j=i++;//j=2,i=3
		//i++ it is a post increment operator 
		//first it will assign the vlaue for the variable and 
		//then it sould incremented by 1
		int k=++i;
		//++i it is a pre increment operator
		//first it will increment the value by 1 and then it should
		//assign
		
		System.out.println(j);
		System.out.println(k);
	}

}
