package com.project.demo;

public class ThisDemo {
	int i;
	//this keyword refers to current class instance variable
	
	public ThisDemo() {
		// TODO Auto-generated constructor stub
	}
	
	

	public void setValues(int i) {
		this.i=i;
		System.out.println("Value of i is: "+i);
	}
	public void showValue() {
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		ThisDemo demo=new ThisDemo();
		demo.setValues(10);
		demo.showValue();
	}

}
