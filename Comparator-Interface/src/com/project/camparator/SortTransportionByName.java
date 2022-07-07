package com.project.camparator;

import java.util.Comparator;

import com.project.transportationdto.TransportationDTO;

public class SortTransportionByName implements Comparator<TransportationDTO> {

	@Override
	public int compare(TransportationDTO o1, TransportationDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
