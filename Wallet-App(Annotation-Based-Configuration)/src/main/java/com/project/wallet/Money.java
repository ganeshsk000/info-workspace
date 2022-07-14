package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Money {
	@Value("coin")
	private String type;
	@Value("1500")
	private String size;
	
	public Money() {
	System.out.println("Object is created: "+this.getClass().getName());
	}

	public Money(String type, String size) {
		super();
		this.type = type;
		this.size = size;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Money [type=" + type + ", size=" + size + "]";
	}
	

}
