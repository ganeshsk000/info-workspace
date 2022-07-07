package com.project.demo;

public class Bracket {
synchronized	public void generate() {
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				System.out.print("{");
			}
			else {
				System.out.print("}");
			}
		}
		System.out.println();
	}

}
