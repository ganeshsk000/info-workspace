package com.project.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import com.project.comparator.SortMedicineByName;
import com.project.comparator.SortMedicineByPrice;
import com.project.dao.PharmacyDAO;
import com.project.dao.PharmacyDaoImpl;
import com.project.dto.MedicineDTO;

public class Tester {
	public static void main(String[] args) {

		List<MedicineDTO> list = new ArrayList<MedicineDTO>();
		list.add(new MedicineDTO(14, "Saridan", 5));
		list.add(new MedicineDTO(12, "Dolo 650", 20));
		list.add(new MedicineDTO(15, "Rantac", 25));

		System.out.println("Fetching list by method reference,,,,,,,,,,,,");
		list.forEach(System.out::println);
		System.out.println("Fetching list throught lambda expression,,,,,,,,,,");
		Consumer<List<MedicineDTO>> consumer = (z) -> System.out.println(list);
		consumer.accept(list);
		System.out.println("using method reference,,,,,,,,,,,,,,");
		PharmacyDAO dao = PharmacyDaoImpl::precautionaryMeasure;
		dao.precautionaryMeasure();
		System.out.println("by using lambda expression,,,,,,,,,,,");
		PharmacyDAO dao1 = () -> System.out.println("taking medicine hepls us to recover fast from any illness");
		dao1.precautionaryMeasure();
		System.out.println("Default sorting technique,,,,,,,,,,");
		Collections.sort(list);
		Consumer<List<MedicineDTO>> consumer1 = (l) -> System.out.println(list);
		consumer1.accept(list);
		System.out.println("Customised sorting technique,,,");
		System.out.println("Sort By Name,,,,,,");
		Collections.sort(list, new SortMedicineByName());
		Consumer<List<MedicineDTO>> consumer2 = (l) -> System.out.println(list);
		consumer2.accept(list);
		System.out.println("Sort by medicine price,,,,,,,,,,,,");
		Collections.sort(list, new SortMedicineByPrice());
		Consumer<List<MedicineDTO>> consumer3 = (l) -> System.out.println(list);
		consumer3.accept(list);

	}

}
