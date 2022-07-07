package com.project.compararableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Names> demo=new ArrayList<Names>();
		demo.add(new Names("Resh"));
		demo.add(new Names("Shiva"));
		demo.add(new Names("Yoga"));
		demo.add(new Names("Sayuhin"));
		demo.add(new Names("Rakytyesh"));
		demo.add(new Names("Ramgfesh"));
		demo.add(new Names("Gufggfdgru"));
		App app=new App();
		app.printNames(demo);
		System.out.println("****************************");
		Collections.sort(demo);
		app.printNames(demo);
		
		
	}
	public void printNames(List<Names> demo) {
		Iterator<Names> itr=demo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
