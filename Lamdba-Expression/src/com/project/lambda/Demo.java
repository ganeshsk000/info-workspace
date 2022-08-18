package com.project.lambda;

public class Demo {
	
	public int getLength(String str) {
		return str.length();
		
	}
	public String demo(String str) {
		return str.toLowerCase();
		
	}
	public String demo1(String str) {
		return str.repeat(3);
		
	}
	public String demo2(String str) {
		return str.replace("G", "A");
		
	}
	public String demo3(String str) {
		return str.substring(3, 5);
		
	}
	public static String demo4(String str) {
		return str.valueOf("dgdgdgfg");
	}
	public String demo5(String str) {
		return str.indent(5);
		
	}
	public String demo6(String str) {
		return str.replace("Raj", "Shekar");
	}
	public char[] demo7(String str) {
		return str.toCharArray();
	}
	public String demo8(String str) {
		return str.strip();
	}
	public int demo9(String str,String str1) {
		return str.compareTo(str1);
	}
	public String demo10(String str) {
		return str.replaceAll("Ganesh", "raj");
	}
	public String demo11(String str) {
		return str.stripIndent();
	}
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.getLength("Ganesh"));
		System.out.println(demo.demo("GANESHDSGDFHDSS"));
		System.out.println(demo.demo1("GGsdsadsdeds"));
		System.out.println(demo.demo2("GsdsG"));
		System.out.println(demo.demo3("GaneshGuruKotresh"));
		System.out.println(Demo.demo4("Rajunath"));
		System.out.println(demo.demo5("Guru"));
		System.out.println(demo.demo6("Rakesh"));
		System.out.println(demo.demo6("Rajshekar"));
		System.out.println(demo.demo7("Rajkumar"));
		System.out.println(demo.demo8(""));
		System.out.println(demo.demo9("Ganesh", "Ganesh"));
		System.out.println(demo.demo10("GaneshGuru"));
		System.out.println(demo.demo11(" fgdfgdgdg fgdgfddgd fgrergdfdd fgdgdfdfgdg"+"           fgdfgdfgdfgdfgfgfgfdfgd"));
		
	}

}
