package com.project.wallet;
public class Wallet{
	
	private int id;
	private String color;
	private String brand;
	private double price;
	private Material material;
	private Money money;
	private ATMCard atmCard;
	
	
	public Wallet() {
		System.out.println("Boject is created: "+this.getClass().getName());
	}


	public Wallet(int id, String color, String brand, double price, Material material, Money money, ATMCard atmCard) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.money = money;
		this.atmCard = atmCard;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	public Money getMoney() {
		return money;
	}


	public void setMoney(Money money) {
		this.money = money;
	}


	public ATMCard getAtmCard() {
		return atmCard;
	}


	public void setAtmCard(ATMCard atmCard) {
		this.atmCard = atmCard;
	}


	@Override
	public String toString() {
		return "Wallet [id=" + id + ", color=" + color + ", brand=" + brand + ", price=" + price + ", material="
				+ material + ", money=" + money + ", atmCard=" + atmCard + "]";
	}

	

	
	
	
}
