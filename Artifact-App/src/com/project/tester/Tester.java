package com.project.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.project.comparator.SortArtifactByInventedIn;
import com.project.comparator.SortArtifactByName;
import com.project.dao.MuseumDAO;
import com.project.dao.MuseumDaoImpl;
import com.project.dto.ArtifactDTO;

public class Tester {
	public static void main(String[] args) {
		List<ArtifactDTO> list=new ArrayList<ArtifactDTO>();
		list.add(new ArtifactDTO(148, "Steam Wagon", 1906));
		list.add(new ArtifactDTO(124, "Vintage Microphone", 17));
		list.add(new ArtifactDTO(145, "Gramphone", 1877));
		
		System.out.println("fetching list through method reference,,,,,,,,,,");
		list.forEach(System.out::println);
		System.out.println("Fetching through an lambda expresiion,,,,,,,,,");
		Consumer<List<ArtifactDTO>> consumer=(a)->System.out.println(list);
		consumer.accept(list);
		System.out.println("Default sorting technique,,,,,,,,");
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("Customised sorting,,,,,,,,,,,,");
		System.out.println("Sort Artifacts by name ");
		Collections.sort(list,new SortArtifactByName());
		list.forEach(System.out::println);
		System.out.println("Sort Artifacts by InventedIn");
		Collections.sort(list,new SortArtifactByInventedIn());
		list.forEach(System.out::println);
		System.out.println("using method reference,,,,,,,,,,,,");
		MuseumDAO dao=MuseumDaoImpl::gainKnowledge;
		dao.gainKnowledge();
		System.out.println("using lambda expression,,,,,,,,,,,,,");
		MuseumDAO dao1=()->System.out.println("calling method through an lambda expresiion");
		dao1.gainKnowledge();
		BiConsumer<Integer, Integer> biConsumer=(a,b)->System.out.println((a-b));
		biConsumer.accept(10, 5);
		
		
	}

}
