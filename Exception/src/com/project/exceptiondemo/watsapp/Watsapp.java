package com.project.exceptiondemo.watsapp;

public class Watsapp {
	public void createGroup(String []names )  {
		if(names.length>5) {
			throw new WatsappException();
		}
		else {
			System.out.println("your watsapp group created sucessfully,,,,,,,,,,");
		}
	}
	public void shareFiles(File file)  {
		if(file.size>1000) {
		throw new WatsappException();
		}
		else {
			System.out.println("file uploaded sucessfully,,,,,,,,,,");
		}
	}

}
