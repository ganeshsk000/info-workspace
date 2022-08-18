package com.project.demo3;

public class ThisDemo {
int id;
String name;

public ThisDemo() {
	// TODO Auto-generated constructor stub
}
public ThisDemo(int id){
	this.id=id;
}
public ThisDemo(int id,String name) {
	this.id=id;
	this.name=name;
}
public void displayProperties() {
	System.out.println(id);
	System.out.println(name);
}
@Override
public String toString() {
	return "ThisDemo [id=" + id + ", name=" + name + "]";
}

}
