package com.project.composition;

public class Tester {
	public static void main(String[] args) {
		Wing wing=new Wing();
		wing.color="red,green";
		wing.shape="passive soaring,acitve soaring";
		wing.size="3.4";
		
		Bird bird=new Bird();
		bird.name="parraot";
		bird.weight="1 kg";
		bird.color="Green";
		bird.wing=wing;
		System.out.println(bird.wing.color);
		System.out.println(bird.wing.shape);
		System.out.println(bird.wing.size);
		bird.wing.fly();
		
	}

}
