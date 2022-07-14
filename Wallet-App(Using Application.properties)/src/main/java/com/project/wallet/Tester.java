package com.project.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String springConfigFile="spring.xml";
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext(springConfigFile);
	     Wallet wallet=	springContainer.getBean(Wallet.class);
	     System.out.println(wallet);
	     ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext();
	     context.close();
	     System.out.println("Application context is closed,,,,,,,,,,");
	    
	}

}
