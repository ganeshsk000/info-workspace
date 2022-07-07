package com.project.comparator;

import java.util.Comparator;

import com.project.dto.MedicineDTO;

public class SortMedicineByPrice implements Comparator<MedicineDTO> {

	@Override
	public int compare(MedicineDTO o1, MedicineDTO o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}

}
