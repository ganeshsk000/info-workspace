package com.project.compararableinterface;

public class Names implements Comparable<Names> {
	private String name;

	public Names() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Names(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Names obj) {
		if(name.length()==obj.name.length()) {
			return 0;
		}
		else if(name.length()<obj.name.length()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	

}
