package com.project.customclass;

//entity
public class MobileDTO {
	private int slno;
	private String name;
	private String color;
	private double price;
	private int ram;
	private int rom;

	public MobileDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileDTO(int slno, String name, String color, double price, int ram, int rom) {
		super();
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ram;
		result = prime * result + rom;
		result = prime * result + slno;
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
		MobileDTO other = (MobileDTO) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (ram != other.ram)
			return false;
		if (rom != other.rom)
			return false;
		if (slno != other.slno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MobileDTO [slno=" + slno + ", name=" + name + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", rom=" + rom + "]";
	}

}
