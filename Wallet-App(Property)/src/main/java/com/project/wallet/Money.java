package com.project.wallet;

public class Money {
	private String type;
	private String size;
	
	public Money() {
		super();
		// TODO Auto-generated constructor stub
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
