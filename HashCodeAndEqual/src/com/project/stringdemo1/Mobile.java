package com.project.stringdemo1;

public class Mobile {
	int slNo;
	String name;
	String location;
	public Mobile(int slNo, String name, String location) {
		super();
		this.slNo = slNo;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Mobile [slNo=" + slNo + ", name=" + name + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + slNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (slNo != other.slNo)
			return false;
		return true;
	}
	
	
	
	

}
