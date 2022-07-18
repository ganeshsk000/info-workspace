package com.project.operatordemo;

public class Tester {
	public static void main(String[] args) {
		WardrobeOperator wardrobe = new WardrobeOperator();
		wardrobe.add(" Top");
		wardrobe.add(" T-shirt");
		wardrobe.add("kurtha");
		wardrobe.add(" Pant");
		wardrobe.add(" Saree");
		wardrobe.add(" Salwar");
		//			wardrobe.add("pasfd");
		wardrobe.update(0, " T-shirt");
		//			System.out.println(wardrobe);
		wardrobe.match("kurtha");
		boolean deletedThing = wardrobe.delete(1);
		//			System.out.println("is thing deleted :".concat(String.valueOf(deletedThing)));
		System.out.println("is thing deleted: "+deletedThing);
		//			System.out.println(wardrobe);
		//			System.out.println(wardrobe);
		//			 boolean check = wardrobe.add("shoes");
		//			 System.out.println(check);
		//		wardrobe.update(3, " Top");
		//			wardrobe.match(" Pant");
		//			wardrobe.match("Salwar");
		//			System.out.println(wardrobe);
		//			wardrobe.delete(2);
	}

}
