package com.project.customclass;

public class Demo {
	public static void main(String[] args) {
		String str="Laptop";
		String str1="Laptop";
		
		System.out.println(str==str1);
		System.out.println("Hashcode of STR: "+str.hashCode()+" Hashcode of Str1: "+str1.hashCode());
		String string=new String("Laptop");
		String string1=new String("Laptop");
		System.out.println(string==string1);
		System.out.println(string.equals(string1));
		System.out.println("String Object hascode: "+string.hashCode()
		+" String 1 Object hashcode "+string1.hashCode());
	}

}
