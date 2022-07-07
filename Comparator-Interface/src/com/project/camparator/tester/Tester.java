package com.project.camparator.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.project.camparator.SortTransportationByTypeOfMode;
import com.project.camparator.SortTransportionByName;
import com.project.transportationdto.TransportationDTO;

public class Tester {
	public static void main(String[] args) {
		List<TransportationDTO> list=new ArrayList<TransportationDTO>();
		list.add(new TransportationDTO(101, "Railways", "Land"));
		list.add(new TransportationDTO(102, "Aeroplane", "Airways"));
		list.add(new TransportationDTO(103, "Cruise Ship", "Waterways"));
		
		System.out.println("before sorting,,,,,,,,,,");
		Iterator<TransportationDTO> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("after sorting,,,,,,,,,,,,,");
		Collections.sort(list);
		Iterator<TransportationDTO> itr1=list.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Sorting by name sorting technique,,,,,,,,,,,,,,,,");
		Collections.sort(list,new SortTransportionByName());
		Iterator<TransportationDTO> itr2=list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("Sorting by type of mode,,,,,,,,,,,");
		Collections.sort(list,new SortTransportationByTypeOfMode());
		Iterator<TransportationDTO> itr3=list.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}
	

}
