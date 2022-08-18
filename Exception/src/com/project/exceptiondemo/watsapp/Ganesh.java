package com.project.exceptiondemo.watsapp;

public class Ganesh {
	public static void main(String[] args) {
		String [] names= {"Dinesh","Revath","Raghu","Suman","Justin",};
		File file=new File();
		Watsapp watspp=new Watsapp();
		
		try {
			watspp.createGroup(names);
			watspp.shareFiles(file);
		}
		catch(Exception e) {
			if(names.length>5) {
				System.out.println(e.getMessage());
			}
			else {
				System.out.println(e);
			}
		}
	}

}
