package com.project.wallet;
/* 
 * Note--
 * in constructor args elemement in xml file,,using of name attribute is optional
 * instead of name,,we can directly assign value of properties,but the values
 * should assign based on the order of parameterised constructor,,,,,,,,,
 * But In property element,,we compulsory decleare name and value attribute */
public class Wallet {
	private int id;
	private String color;
	private String brand;
	private double price;
	private Material material;
	private ATMCard atmCard;
	private Money money;
	private Photo photo;
	
	
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wallet(int id, String color, String brand, double price, Material material, Money money, ATMCard atmCard,
			Photo photo) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.material = material;
		this.money = money;
		this.atmCard = atmCard;
		this.photo = photo;
	}

//	public Wallet(Money money, Photo photo, String color, String brand, double price, Material material, int id,
//			ATMCard atmCard) {
//		super();
//		this.money = money;
//		this.photo = photo;
//		this.color = color;
//		this.brand = brand;
//		this.price = price;
//		this.material = material;
//		this.id = id;
//		this.atmCard = atmCard;
//	}

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

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Wallet [id=" + id + ", color=" + color + ", brand=" + brand + ", price=" + price + ", material="
				+ material + ", money=" + money + ", atmCard=" + atmCard + ", photo=" + photo + "]";
	}
	
	
	
}
