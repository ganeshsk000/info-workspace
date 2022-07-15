package com.project.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class HandlerController {
	
	
	public HandlerController() {
		System.out.println("Object is created: "+this.getClass().getName());
	}
	
	@RequestMapping("/save.do")
	public void saveData() {
		System.out.println("Involked save data ()");
		System.out.println("this is first handler,,,,,,,,,");
	}
	@RequestMapping("/update.do")
	public void updateData() {
		System.out.println("involked update Data()");
		System.out.println("this is second handler");
	}
	@RequestMapping("/read.do")
	public void readData() {
		System.out.println("involked readData()");
		System.out.println("this is third handler");
	}

}
