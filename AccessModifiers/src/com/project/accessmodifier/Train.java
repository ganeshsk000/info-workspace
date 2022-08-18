package com.project.accessmodifier;
//access modifiers are visibility specifiers
// 4 types of acces modifiers are there
//default,public,private,protected
//first default,,within package ok,outside package we cannot access
//second public,,within package ok,outside package also,,,,,
//third private,,within class ok,within package not ok,outside package not ok
//fourth protected,,within class ok,within package we can access,subclass of different
//package,,it will be ok,,,,but the object should in the current class,,,,,,
public class Train {
	protected int id=101;
	protected String name="jan shatabdi";
	protected String color="red";
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	void speed() {
		System.out.println("train speed is 120km/hr,,,,,,,,,,,");
	}

}
