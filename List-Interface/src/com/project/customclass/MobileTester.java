package com.project.customclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MobileTester {
	public static void main(String[] args) {
		MobileDTO Mobile = new MobileDTO(1, "Samsung", "White", 25000.00, 4, 16);
		MobileDTO Mobile1 = new MobileDTO(2, "Vivo", "Black", 20000.00, 8, 64);
		MobileDTO Mobile2 = new MobileDTO(3, "Lenovo", "Blue", 28000.00, 6, 32);
		MobileDTO Mobile3 = new MobileDTO(4, "iphone", "Red", 55000.00, 4, 16);
		MobileDTO Mobile4 = new MobileDTO(5, "Vivo", "White", 27000.00, 8, 16);
		MobileDTO Mobile5 = new MobileDTO(5, "Vivo", "White", 27000.00, 8, 16);

		List<MobileDTO> mobileContainer = new LinkedList<MobileDTO>();
		mobileContainer.add(Mobile);
		mobileContainer.add(Mobile1);
		mobileContainer.add(Mobile2);
		mobileContainer.add(Mobile3);
		mobileContainer.add(Mobile4);
		mobileContainer.add(Mobile5);
		MobileTester tester = new MobileTester();
		

		mobileContainer.remove(4);
		mobileContainer.size();
		mobileContainer.contains(Mobile3);
		System.out.println(Mobile.hashCode());
		System.out.println(Mobile1.hashCode());
		System.out.println(Mobile2.hashCode());
		System.out.println(Mobile3.hashCode());
//		MobileTester tester=new MobileTester();
//		tester.demo();

		System.out.println(Mobile4.equals(Mobile5));

		System.out.println("iterating by using iterator interface,,,,,,,,,,,,,");
		Iterator<MobileDTO> itr = mobileContainer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (MobileDTO dto : mobileContainer) {
			System.out.println(dto.getName());
		}

	}

}
